{
    test_cases:
    [
        {
            method: "queue_peek",
            input:
            {
                array: [-2147483610],
            },
        },
        {
            method: "queue_peek",
            input:
            {
                array: [-2147483610, 0, 0],
            },
        },
        {
            method: "queue_peek",
            input:
            {
                array: [-2147483610] + std.repeat([0], 92),
            },
        },
        {
            method: "queue_peek",
            input:
            {
                array: [21] + std.repeat([0], 74),
            },
        },
    ],
}