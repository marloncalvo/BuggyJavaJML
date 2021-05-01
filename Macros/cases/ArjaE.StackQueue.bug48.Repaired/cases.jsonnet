{
    test_cases:
    [
        {
            method: "queue_search",
            comment: "False negative by OpenJML",
            input:
            {
                key: -2147475550,
                array: std.repeat([0], 51) + [-2147475550],
            },
        },
        {
            method: "queue_search",
            comment: "False negative by OpenJML",
            input:
            {
                key: -2147475550,
                // length 52
                array: std.repeat([0], 31) + [-2147475550] + std.repeat([0], 20),
            },
        },
    ],
}