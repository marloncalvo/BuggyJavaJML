from array import array
import json
import argparse
import _jsonnet
from util import get_bs_index, get_index, get_last_index, test_case_body


def __get_key(expected_mid, high, array):
    low = 0
    mid = high // 2
    old_high = high
    while low < high:
        print(mid)
        if mid == expected_mid:
            break
        if mid > expected_mid:
            high = mid
        else:
            low = mid + 1

        mid = low + (high - low) // 2

    return array[mid] if mid < old_high else array[-1] + 1


def binarysearch(high, expected_mid=None):
    key = __get_key(expected_mid, high, __array)
    result = get_index(key, __array)

    return f"""int [] array = {get_array};
    int key = {key};
    int res = BinarySearch.Binary(array, key);
    assertEquals({result}, res);"""


def get_array(flag=True):
    if flag:
        return f"""getArray()"""
    else:
        return f"""int [] getArray() {{
            int size = Integer.MAX_VALUE-5;
            int [] array = new int[size];
            for (int i = 0; i < size; i++) {{
                if (i % 2 == 0) array[i] = i;
                else array[i] = array[i-1];
            }}
        }}
        """


def __build_java_array_fun(var, array):
    elements = str(array)
    elements = "{" + elements[1:-1] + "}"
    func_name = f"get_{var}"
    return func_name, f"""int [] {func_name}() {{
        return new int [] {elements};
    }}"""


def __default_alloca(var, init):
    return var


def swap(x, y, array, galloc):
    old_x = array[x]
    old_y = array[y]
    get_arr = galloc("array", __build_java_array_fun, array);
    return f"""SwapInArray sia = new SwapInArray();
    int [] array = {get_arr}();
    int x = {x};
    int y = {y};
    sia.swap(x, y, array);
    assertEquals({old_x}, array[y]);
    assertEquals({old_y}, array[x]);"""


def find_first_sorted(x, array, galloc):
    idx = get_index(x, array)
    get_arr = galloc("array", __build_java_array_fun, array)
    return f"""int [] arr = {get_arr}();
    int x = {x};
    int res = FIND_FIRST_IN_SORTED.find_first_in_sorted(arr, x);
    assertEquals({idx}, res);"""


def find_first_zero(array, galloc):
    idx = get_index(0, array)
    get_arr = galloc("array", __build_java_array_fun, array)
    return f"""int [] arr = {get_arr}();
    int res = FindFirstZero.FindFirstZero(arr);
    assertEquals({idx}, res);"""


def find_last(key, array, galloc):
    idx = get_last_index(key, array)
    get_arr = galloc("array", __build_java_array_fun, array)
    return f"""
    int [] array = {get_arr}();
    int key = {key};
    FindInArray fia = new FindInArray(array, key);
    assertEquals({idx}, fia.findLast());"""


def binsearch(start, end, x, array, galloc):
    get_arr = galloc("array", __build_java_array_fun, array)
    idx = get_bs_index(x, array, start, end)

    return f"""int [] array = {get_arr}();
    int start = {start};
    int end = {end};
    int x = {x};
    int res = FIND_IN_SORTED.binsearch(array, x, start, end);
    assertEquals({idx}, res);"""


def define_utils():
    return ""


def load(file):
    o = json.loads(_jsonnet.evaluate_file(file))
    print()
    print(define_utils())
    global_fields = []
    for i, test_case in enumerate(o["test_cases"]):

        def galloc(var, init, *args): 
            new_var = f"{var}_{i}"
            func_name, init_line = init(new_var, *args)
            global_fields.append(init_line)
            return func_name

        method = test_case["method"]
        comment = test_case.get("comment", "")
        body = ""

        if "invalid" in test_case and test_case["invalid"]:
            body = f'fail("The function {method}() is not testable for this case");'
        else:
            input = test_case["input"]
            method = globals()[method]
            body = method(**input, galloc=galloc)

        print(test_case_body(body, comment, i))
    print()
    for field in global_fields:
        print(field)
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