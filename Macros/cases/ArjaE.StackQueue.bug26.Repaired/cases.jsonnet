{
    test_cases:
    [
        {
            method: "driverStack",
            input:
            {
                op: 0,
                array: [],
                input: -3,
            },
        },
        {
            method: "stack_getElem",
            input:
            {
                array: [1] + std.repeat([0], 50),
                index: 0
            },
        },
        {
            method: "stack_getElem",
            input:
            {
                array: std.repeat([0], 50) + [14],
                index: 50
            },
        },
    ],
}