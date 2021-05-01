{
    test_cases:
    [
        {
            method: "stack_push",
            input:
            {
                x: 2147475283,
                array: std.repeat([0], 100),
            },
        },
        {
            method: "stack_push",
            input:
            {
                x: -2147475283,
                array: std.repeat([0], 100),
            },
        },
    ],
}