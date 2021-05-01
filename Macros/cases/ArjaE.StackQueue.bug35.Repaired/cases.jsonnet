{
    test_cases:
    [
        {
            method: "queue_delete",
            input:
            {
                array: std.range(0, 2) + std.repeat([0], 95),
            },
        },
    ],
}