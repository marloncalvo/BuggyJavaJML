{
    test_cases:
    [
        {
            method: "stack_peek",
            input:
            {
                array: std.repeat([0], 57) + [11],
            },
        },
        {
            method: "stack_peek",
            input:
            {
                array: [11],
            },
        },
        {
            method: "stack_peek",
            input:
            {
                array: std.repeat([0], 62) + [11, 14],
                n_assert: 2
            },
        },
    ],
}