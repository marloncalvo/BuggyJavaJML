# BuggyJava+JML

The BuggyJava+JML dataset has 597 buggy programs, that each program has one bug. This dataset is created based on the Java+JML dataset by using PITest. PITest generates bugs by changing control conditions, changing assignment expressions, removing a method call, and changing return values. Only two bugs in this dataset are real bugs (from QuixBug) that we add JML specification to their correct versions. 

Each buggy program has a formal specification in JML that describes the correct behavior of the program. Also, OpenJML cannot verify the correctness of these programs. We used OpenJML 8.46 for this study, and you can find warnings besides each buggy program with the name "esc.txt" in the dataset. 

Among 597 buggy programs, 40 cannnot be detected with the JUnitTests dataset, and 10 of them goes to an infinite loop. Thus, for our APR study, we used 547 buggy programs.

# JUnitTests

JUnitTests is generated by running Kelinci (the Java version of AFL fuzzer) 5 times on each program in the Java+JML dataset (correct version of programs) to cover all normal branch behavior. This test does not cover branches that are terminated to the "throw Exception." Kelinci provides tests by covering all branches in each run. Thus, each branch is covered at least 5 individual tests.

# NotVerified

Repaired programs cannot be verified with OpenJML for two main reasons.

1) Repaired program is overfitted. It means the repaired program is not correct based on the correct version of the programs' expected behavior, but it satisfies the test suite, which is provided with JUnitTests.  

2) It is JML False Negative. It is possible that JML specification mistakenly considers a correct repaired program as overfitted. It happens only for about 4.68% of generated patches. We classified these false negatives into three classes: 1) Structural 2) Modular 3) Overflow.

# TimeComplexityOrder

Our results show that the order of time complexity can change and increase dramatically by using current dynamic APR tools. It happened for seven programs in our study. Increasing the order of time complexity is not a test overfitting problem in theory because the expected behavior is still correct. However, it could be a significant issue in practice by changing the program's character (changing binary search to a linear search).



These dataset were created for the following paper. Cite this paper if you use these programs in any academic research.

@inproceedings{aprFormalMethods,
  title={Exploring True Test Overfitting in Dynamic Automated Program Repair using Formal Methods (in press)},
  author={Amirfarhad Nilizadeh and Gary T. Leavens and Xuan-Bach Le and Corina S. Pasareanu and David Cok},
  booktitle={2021 14th IEEE Conference on Software Testing, Validation and Verification (ICST)},
  year={2021},
  organization={IEEE}
}



