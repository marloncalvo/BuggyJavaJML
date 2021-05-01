{
  test_cases: 
  [
    {
      method: "peek",
      input: 
      {
        array: [14],
        length: 100,
        n_assert: 1,
      },
    },
    {
      method: "peek",
      input: 
      {
        array: [14, 11],
        length: 100,
        n_assert: 2,
      },
    },
    {
      method: "peek",
      input: 
      {
        array: std.repeat([11], 100),
        length: 100,
        n_assert: 101,
      },
    },
  ]
}
