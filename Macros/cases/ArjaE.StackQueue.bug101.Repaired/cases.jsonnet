{
    test_cases:
    [
        {
            method: "driverStack",
            input: 
            {
                op: 1,
                input: -12321,
                length: 91,
                array: [2147481739, -2147483647, 0],
            }
        },
        {
            method: "driverStack",
            input:
            {
                op: 1,
                input: -12321,
                length: 50,
                array: [2147481739, -2147483647, -2],
            },
        },
        {
            method: "driverStack",
            input:
            {
                op: 1,
                input: -12321,
                length: 46,
                array: [2147481739, -2147483648, -1],
            },
        },
        {
            method: "driverStack",
            input:
            {
                op: 1,
                input: -12321,
                length: 46,
                array: [-1073737987, 1073745662, -429495707],
            },
        },
    ]
}