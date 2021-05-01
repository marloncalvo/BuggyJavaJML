{
    test_cases:
    [
        {
            method: "stack_pop",
            input:
            {
                array: [],
            },
        },
        {
            method: "stack_pop",
            input:
            {
                array: std.repeat([0], 100),
            },
        },
        {
            method: "stack_pop",
            input:
            {
                array: [],
            },
        },
    ],
}