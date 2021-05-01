{
    test_cases:
    [
        {
            method: "stack_peek",
            input:
            {
                array: [],
            },
        },
        {
            method: "stack_peek",
            input:
            {
                array: std.repeat([0], 100),
            },
        },
    ],
}