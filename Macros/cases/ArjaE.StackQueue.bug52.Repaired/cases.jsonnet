{
    test_cases:
    [
        {
            method: "queue_isFull",
            invalid: true,
            comment: "Cannot insert to queue without illegal arg exception",
            input:
            {
                array: std.repeat([0], 99),
            },
        },
    ],
}