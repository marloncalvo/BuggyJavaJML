{
    test_cases:
    [
        {
            method: "queue_isContain",
            input:
            {
                key: 1,
                array: std.repeat([0], 54) + [1],
            },
        },
        {
            method: "queue_isContain",
            invalid: true,
        },
    ],
}