{
    test_cases:
    [
        {
            method: "queue_delete",
            input:
            {
                array: [30] + std.repeat([0], 99),
            },
        },
        {
            method: "queue_delete",
            comment: "OpenJML false negative",
            input:
            {
                array: [23] + std.repeat([0], 51),
            },
        },
    ],
}