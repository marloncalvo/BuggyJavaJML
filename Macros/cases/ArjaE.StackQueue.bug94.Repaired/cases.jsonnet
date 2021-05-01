{
    test_cases:
    [
        {
            method: "driverqstack",
            invalid: true,
            comment: "inputs are out of int range",
            input:
            {
                queue: [4294967300] + std.repeat([0], 12),
                stack: [1] + std.repeat([0], 44),
                op: 3
            },
        },
        {
            method: "driverqstack",
            invalid: true,
            comment: "inputs are out of int range",
            input:
            {
                queue: [-94] + std.repeat([0], 55),
                stack: [2147483650] + std.repeat([0], 59),
                op: 3,
            },
        },
    ],
}