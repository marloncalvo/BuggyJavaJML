from datetime import date, datetime, timedelta
from util import test_case

def get_time_string(time: datetime, var="time"):
    return f"Time {var} = new Time({time.hour}, {time.minute}, {time.second});"


def get_time():
    print("getting time...")
    second, minute, hour = input("second: "), input("minute: "), input("hour: ")
    return datetime.strptime(f"{hour}:{minute}:{second}", "%H:%M:%S")


def time_options():
    pass


def difference_times(a, b, var="diff"):
    if b > a:
        a = b
    c = a - b
    c = datetime.min + c
    return f"""assertEquals({c.hour}, {var}.getHour());
    assertEquals({c.minute}, {var}.getMinute());
    assertEquals({c.second}, {var}.getSecond());"""

def difference():
    time = get_time()
    a = get_time()
    b = get_time()
    if b > a:
        c = a
        a = b
        b = c
    c = a - b
    c = datetime.min + c
    return f"""{get_time_string(time, "time")}
    {get_time_string(a, "a")}
    {get_time_string(b, "b")}
    Time diff = time.difference(a, b);
    {difference_times(a,b)}"""

def equals():
    a = get_time()
    b = get_time()
    body = f"""{get_time_string(a, "a")}
    {get_time_string(b, "b")}
    """

    if a == b:
        body += f"assertEquals(a, b);"
    else:
        body += f"assertNotEquals(a, b);"
    
    return body

def decr():
    print("input time")
    time = get_time()
    new_time = time - timedelta(seconds=1)
    return f"""{get_time_string(time)}
time.decr();
assertEquals({new_time.hour}, time.getHour());
assertEquals({new_time.minute}, time.getMinute());
assertEquals({new_time.second}, time.getSecond());"""


def timer():
    return f"""fail("Cannot test timer()");"""


def set_second():
    second = int(input("second: "))
    if second < 0 or second >= 60:
        return f"""Time time = new Time(-1, -1, -1);
        assertThrows(IllegalArgumentException.class, () -> {{
            time.setSecond({second});
        }});"""
    else:
        return f"""Time time = new Time(-1, -1, -1);
        assertDoesNotThrow(() -> {{
            time.setSecond({second});
        }});
        assertEquals({second}, time.getSecond());"""


def set_minute():
    minute = int(input("minute: "))
    body = f"Time time = new Time(-1, -1, -1);"
    if minute < 0 or minute >= 60:
        body += f"""
        assertThrows(IllegalArgumentException.class, () -> {{
            time.setMinute({minute});
        }});"""
    else:
        body += f"""
        assertDoesNotThrow(() -> {{
            time.setMinute({minute});
        }});
        assertEquals({minute}, time.getMinute());"""

    return body


def set_hour():
    hour = int(input("hour: "))
    body = f"Time time = new Time(-1, -1, -1);"
    if hour < 0 or hour >= 24:
        body += f"""
        assertThrows(IllegalArgumentException.class, () -> {{
            time.setHour({hour});
        }});"""
    else:
        body += f"""
        assertDoesNotThrow(() -> {{
            time.setHour({hour});
        }});
        assertEquals({hour}, time.getHour());"""

    return body


def is_time_zero():
    time = get_time()
    body = f"{get_time_string(time)}"
    ret = "\n"
    if datetime.hour == datetime.minute and datetime.minute == datetime.second and datetime.hour == 0:
        ret += f'assertTrue(time.isTimeZero());'
    else:
        ret += f'assertFalse(time.isTimeZero());'

    return body + ret

def later_than():
    a = get_time()
    b = get_time()
    c = a > b
    return f"""{get_time_string(a, "time")}
    {get_time_string(b, "start")}
    {"assertTrue" if c else "assertFalse"}(time.later_than(start));"""

def gettime():
    time = get_time()
    return f"""{get_time_string(time, "time")}
    Time res = time.getTime();
    assertEquals(time.getHour(), res.getHour());
    assertEquals(time.getMinute(), res.getMinute());
    assertEquals(time.getSecond(), res.getSecond());"""


def time_option():
    time = get_time()
    start = get_time()
    end = get_time()
    sel = int(input("sel: "))

    body = f"""{get_time_string(time, "time")}
    {get_time_string(time, "__timeOld")}
    {get_time_string(start, "start")}
    {get_time_string(start, "__startOld")}
    {get_time_string(end, "end")}
    {get_time_string(end, "__endOld")}
    int sel = {sel};
    Time res = time.timeOptions(start, end, sel);"""

    if sel == 4:
        body += difference_times(start, end, "res")
    elif sel == 3:
        if start == end:
            body += f"""
            assertEquals(0, res.getHour());
            assertEquals(0, res.getMinute());
            assertEquals(0, res.getSecond());
            assertEquals(0, start.getHour());
            assertEquals(0, start.getMinute());
            assertEquals(0, start.getSecond());
            assertEquals(__endOld.getHour(), end.getHour());
            assertEquals(__endOld.getMinute(), end.getMinute());
            assertEquals(__endOld.getSecond(), end.getSecond());"""
        else:
            body += f"""
            assertEquals(__timeOld.getHour(), res.getHour());
            assertEquals(__timeOld.getMinute(), res.getMinute());
            assertEquals(__timeOld.getSecond(), res.getSecond());"""
    elif sel >= 0 and sel <= 2:
        body += f"""assertEquals(0, res.getHour());
		assertEquals(0, res.getMinute());
		assertEquals(0, res.getSecond());
        assertEquals(__startOld.getHour(), start.getHour());
		assertEquals(__startOld.getMinute(), start.getMinute());
		assertEquals(__startOld.getSecond(), start.getSecond());
        assertEquals(__endOld.getHour(), end.getHour());
        assertEquals(__endOld.getMinute(), end.getMinute());
        assertEquals(__endOld.getSecond(), end.getSecond());"""

    return body


def not_testable():
    return f"""fail("The function {input("function_name: ")} is not testable for this case");"""

print("select function to generate test for")
func = int(input("""

0: equals
1: difference
2: later_than
3: time_options
4: set_second
5: get_time
6: set_minute
7: is_time_zero
8: set_hour

Default: Generate uncreatable fail test

func: """))

if func == 0:
    func = equals
elif func == 1:
    func = difference
elif func == 2:
    func = later_than
elif func == 3:
    func = time_option
elif func == 4:
    func = set_second
elif func == 5:
    func = gettime
elif func == 6:
    func = set_minute
elif func == 7:
    func = is_time_zero
elif func == 8:
    func = set_hour
else:
    func = not_testable

body = func()
print(test_case(body, index))