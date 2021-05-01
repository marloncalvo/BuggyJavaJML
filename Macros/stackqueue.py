from util import test_case_body
from dataclasses import dataclass
import json
import argparse
import _jsonnet


@dataclass
class Bucket:
    value: int
    count: 0


def __push(var, value):
    return f"{var}.push({value});"


def __peek(var):
    return f"{var}.peek()"


def __stackqueue(var):
    return f"StackQueue {var} = new StackQueue();"


def __stack(var):
    sqvar = f"{var}StackQueue"

    return f"""{__stackqueue(sqvar)}
    StackQueue.Stack {var} = {sqvar}.new Stack();"""


def __queue(var):
    sqvar = f"{var}StackQueue"

    return f"""{__stackqueue(sqvar)}
    StackQueue.Queue {var} = {sqvar}.new Queue();"""


def __pad(arr, length):
    n = length - len(arr)
    temp = ["-12321"] * n
    return temp


def __init(var, array, type=0):
    const = __stack if type == 0 else __queue
    return f"""{const(var)}
    {__build_array(var, array, type=type)}"""


def __init_queue(var, array):
    return __init(var, array, type=1)


def __init_stack(var, array):
    return __init(var, array, type=0)


def __buckets(array):
    if len(array) == 0:
        return array

    buckets = [
        Bucket(array[0], 1)
    ]

    for value in array[1:]:
        if value == buckets[-1].value:
            buckets[-1].count += 1
        else:
            buckets.append(Bucket(value, 1))

    return buckets


def __build_array(var, items, type=0):
    func = "push" if type == 0 else "enter"
    buckets = __buckets(items)
    buckets = list(map(lambda b: repeat_util_java(
        f"{var}.{func}({b.value});", b.count), buckets))
    buckets = "\n".join(buckets)

    return buckets


def queue_enter(array, data):
    var = "queue"
    valid = len(array) < 100

    body = f"""{__init_queue(var, array)}
    int oldRear = {var}.getRear();
    int oldFront = {var}.getFront();
    """

    if valid:
        body += f"""assertDoesNotThrow(() -> {{
            {var}.enter({data});
            }});
            assertEquals({len(array)+1}, {var}.getRear());
            assertEquals({data}, {var}.getElem({len(array)}));
            assertEquals(oldRear+1, {var}.getRear());
            """
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.enter({data});
        }});
        assertEquals(oldRear, {var}.getRear());
        """

    body += f"assertEquals(oldFront, {var}.getFront());"

    return body


def queue_peek(array):
    var = "queue"
    valid = len(array) != 0

    body = f"""{__init_queue(var, array)}
    int oldFront = {var}.getFront();
    int oldRear = {var}.getRear();
    """

    if valid:
        body += f"""int [] res = {{-1}};
        assertDoesNotThrow(() -> {{
            res[0] = {var}.peek();
        }});
        assertEquals({array[0]}, res[0]);
        assertEquals(oldRear, {var}.getRear());"""
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.peek();
        }});"""

    return body


def queue_delete(array):
    var = "queue"
    varOld = "oldQueue"
    valid = len(array) > 0
    length = len(array)

    body = f"""{__init_queue(var, array)}
    {__init_queue(varOld, array)}
    """

    if valid:
        body += f"""int [] resArray = {{-1}};
                assertDoesNotThrow(() -> {{
                    resArray[0] = {var}.delete();
                }});
                int res = resArray[0];
                assertEquals({length-1}, {var}.getRear());
                assertEquals({array[0]}, res);
                for (int i = 0; i < {length-1}; i++) {{
                    assertEquals({varOld}.getElem(i+1), {var}.getElem(i));
                }}"""
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.delete();
        }});"""

    return body


def queue_isFull(array):
    var = "queue"
    full = len(array) == 100

    return f"""{__queue(var)}
    {__build_array(var, array, type=1)}
    {"assertTrue" if full else "assertFalse"}({var}.isFull());"""


def stack_getElem(array, index):
    var = "stack"

    return f"""{__stack(var)}
    {__build_array(var, array)}
    assertEquals({array[index]}, {var}.getElem({index}));
    assertEquals({len(array)-1}, {var}.getTop());"""


def stack_peek(array, n_assert=1):
    var = "stack"
    valid = len(array) != 0

    body = f"""{__init_stack(var, array)}
    """

    if valid:
        asserts = repeat_util_java(
            f"assertEquals({array[-1]}, {var}.peek());", n_assert)

        body += f"""assertDoesNotThrow(() -> {{
            {asserts}
        }});
        assertEquals({len(array)-1}, {var}.getTop());"""
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.peek();
        }});"""

    return body


def stack_pop(array):
    var = "stack"
    oldVar = "oldStack"
    valid = len(array) > 0

    body = f"""{__init_stack(var, array)}
    {__init_stack(oldVar, array)}
    """

    if valid:
        body += f"""int [] res = {{-1}};
        assertDoesNotThrow(() -> {{
            res[0] = {var}.pop();
        }});
        assertEquals({oldVar}.getTop()-1, {var}.getTop());
        assertEquals({oldVar}.getElem({oldVar}.getTop()), res[0]);
        for (int i = 0; i < 100; i++) {{
            assertEquals({oldVar}.getElem(i), {var}.getElem(i));
        }}"""
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.pop();
        }});"""

    return body


def stack_search(key, array):
    var = "stack"
    try:
        idx = array.index(key)
    except Exception:
        try:
            idx = array.index(str(key))
        except:
            idx = -1

    return f"""{__stack(var)}
    {__build_array(var, array)}
    assertEquals({idx}, {var}.search({key}));"""


def stack_push(x, array):
    var = "stack"
    varOld = "oldStack"
    valid = len(array) < 100

    body = f"""{__init_stack(var, array)}
    {__init_stack(varOld, array)}
    """

    if valid:
        body += f"""assertDoesNotThrow(() -> {{
            {var}.push({x});
        }});
        assertEquals({varOld}.getTop()+1, {var}.getTop());
        for (int i = 0; i < {var}.getTop(); i++) {{
            assertEquals({varOld}.getElem(i), {var}.getElem(i));
        }}
        """
    else:
        body += f"""assertThrows(IllegalArgumentException.class, () -> {{
            {var}.push({x});
        }});
        """

    return body


def queue_search(key, array):
    var = "queue"
    try:
        idx = array.index(key)
    except Exception:
        try:
            idx = array.index(str(key))
        except:
            idx = -1

    return f"""{__init_queue(var, array)}
    assertEquals({idx}, {var}.search({key}));
    assertEquals({key}, {var}.getElem({idx}));"""


def stack_isEmpty(array):
    var = "stack"
    cond = len(array) == 0
    return f"""{__init_stack(var, array)}
    {"assertTrue" if cond else "assertFalse"}({var}.isEmpty());"""


def driverStack(op, input, array):
    var = "stack"

    body = f"""{__init_stack(var, array)}
    int oldTop = {var}.getTop();
    int oldSize = {var}.size();
    int res = {var}StackQueue.driverStack({var}, {op}, {input});
    """

    if op == 0:
        body += f"""assertEquals({input}, {var}.peek());
        assertEquals(oldTop+1, {var}.getTop());
        assertEquals(0, res);"""
    elif op == 1:
        body += f"""assertEquals({array[-1]}, res);
        assertEquals(oldTop-1, {var}.getTop());"""
    elif op == 4:
        body += f"""assertEquals({array[-1]+array[-2]}, res);
        assertEquals(oldTop-1, {var}.getTop());"""
    elif op == 7:
        body += f"""assertEquals({array[-1]}%{array[-2]}, res);
        assertEquals(oldSize-1, {var}.size());"""

    return body


def driverqstack(stack, queue, op):
    s_var = "stack"
    q_var = "queue"

    body = f"""{__init_queue(q_var, queue)}
    {__init_stack(s_var, stack)}
    int res = {s_var}StackQueue.driverQStack({s_var}, {q_var}, {op});
    """

    if op == 3:
        body += f"""assertEquals({s_var}.peek() / {q_var}.peek(), res);"""

    return body


def __queue(var):
    sqvar = f"{var}StackQueue"

    return f"""{__stackqueue(sqvar)}
    StackQueue.Queue {var} = {sqvar}.new Queue();"""


def queue_isContain(key, array):
    contains = key in array or str(key) in array
    var = "queue"

    return f"""{__queue(var)}
    {__build_array(var, array, type=1)}
    {"assertTrue" if contains else "assertFalse"}({var}.isContain({key}));
    """

def qdivisionstack(queue, stack):
    qVar = "queue"
    sVar = "stack"

    return f"""{__init_stack(sVar, stack)}
    {__init_queue(qVar, queue)}
    int res = {qVar}StackQueue.qDivideStack({qVar}, {sVar});
    assertEquals({qVar}.peek() / {sVar}.peek(), res);"""


def qdivision(array):
    var = "queue"
    
    return f"""{__init_queue(var, array)}
    int oldRes = {var}.getElem({var}.getFront()) / {var}.getElem({var}.getFront()+1);
    int oldSize = {var}.size();
    int res = {var}StackQueue.QDivision({var});
    assertEquals(oldRes, res);
    assertEquals(oldSize-1, {var}.size());"""


def stack_isContain(key, array):
    contains = key in array or str(key) in array
    var = "stack"

    return f"""{__stack(var)}
    {__build_array(var, array, type=0)}
    {"assertTrue" if contains else "assertFalse"}({var}.isContain({key}));"""


def repeat_util_java(body="", times=0, flag=True):
    if flag:
        return f"""repeat(() -> {{
            {body}
        }}, {times});"""
    else:
        return f"""void repeat(Runnable r, int times) {{
            for (int i = 0; i < times; i++) {{
                r.run();    		
            }}
        }}"""


def define_utils():
    return repeat_util_java(flag=False)


def load(file):
    o = json.loads(_jsonnet.evaluate_file(file))
    print()
    print(define_utils())
    for i, test_case in enumerate(o["test_cases"]):
        method = test_case["method"]
        comment = test_case.get("comment", "")
        body = ""

        if "invalid" in test_case and test_case["invalid"]:
            body = f'fail("The function {method}() is not testable for this case");'
        else:
            input = test_case["input"]
            method = globals()[method]
            body = method(**input)

        print(test_case_body(body, comment, i))
    print()


def init_argparse() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        usage="$(prog)s FILE",
        description="""Generate JUnit test cases for program based off of specs.
        """
    )

    parser.add_argument('file', help="jsonnet file describing input")
    return parser


def main():
    parser = init_argparse()
    args = parser.parse_args()
    path = args.file
    load(path)


if __name__ == "__main__":
    main()
