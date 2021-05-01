{
    test_cases:
    [
        {
            method: "qdivision",
            comment: "False negative by OpenJML due to bug...",
            input:
            {
                array: [0, 515, 0, 0, 0],
            },
        },
        {
            method: "qdivision",
            comment: "Not frame test case, but derived from",
            input:
            {
                array: [515, 3, 0, 0, 0],
            },
        },
    ],
}