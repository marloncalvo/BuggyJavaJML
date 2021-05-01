{
    test_cases:
    [
        {
            method: "driverqstack",
            comment: "Use default as three to avoid / 0",
            input:
            {
                queue: [-54] + std.repeat([3], 10), 
                stack: [-36] + std.repeat([3], 10),
                op: 3,
            },
        },
        {
            method: "driverqstack",
            comment: "Use default as three to avoid / 0",
            input:
            {
                queue: [101] + std.repeat([3], 4),
                stack: [116] + std.repeat([3], 22),
                op: 3,
            },
        },
    ],
}