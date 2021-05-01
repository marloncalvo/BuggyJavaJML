{
    test_cases:
    [
        {
            method: "queue_enter",
            comment: "Assumes we can build queue of size 100",
            invalid: true,
        },
        {
            method: "queue_enter",
            comment: "False negative because isFull always true.",
            input:
            {
                array: [],
                data: -12321,
            },
        },
        {
            method: "queue_isFull",
            input:
            {
                array: std.repeat([0], 99),
            },
        },
    ],
}