from dataclasses import dataclass


def test_case_body(body, comment, index):
    return f"""
    /*
    {comment}
    */
    @Test
    void test{index}() {{
        {body}
    }}"""


@dataclass
class Bucket:
    value: int
    count: 0


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


def build_array(var, array):
    buckets = __buckets(array)
    buckets = list(map(lambda b: repeat_util_java(
        f"{var}.{func}({b.value});", b.count), buckets))
    buckets = "\n".join(buckets)

    return buckets

def get_index(key, array):
    try:
        idx = array.index(key)
    except Exception:
        try:
            idx = array.index(str(key))
        except:
            idx = -1

    return idx