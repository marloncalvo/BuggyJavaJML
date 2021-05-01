def print_array():
    print('[')
    for i in range(0, 2147483643):
        print(i//2, end=',')
    print(']')

print_array()