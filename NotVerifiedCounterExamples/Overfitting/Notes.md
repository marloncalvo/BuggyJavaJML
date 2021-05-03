# Notes
Description of weird cases

# Cardumen
## Inverse
### Bug 7

There are multiple traces of issues in the counterexamples. Case 2 is inherently
a infinitely looping case, so we need to add a JUnit test which checks for 
completion (based on time).

# jGenProg
## Binary Search
### Bug 11

The array size defined by the input case is too large for my system, throws
array size too large error. May work on another system though.

# Kali-A
## StackQueue
### Bug 54
Seems that the counterexample for enter is only describing an issue which comes
up due isFull being wrong, so it does not take into account bug with signaling.

Also, this tracing section makes no sense which decides the 
ensures block to execute...
```
/home/marloncalvo/workspace/buggyjavajml/NotVerifiedCounterExamples/Overfitting/Kali-A/StackQueue/bug54/Repaired/StackQueue.java:172:  	requires !isFull(); 
			VALUE: isFull()	 === false
			VALUE: !isFull()	 === true
/home/marloncalvo/workspace/buggyjavajml/NotVerifiedCounterExamples/Overfitting/Kali-A/StackQueue/bug54/Repaired/StackQueue.java:179:  	requires isFull(); 
			VALUE: isFull()	 === true
```

TODO: Need to add assert that it throws exception.

## StudentEnrollment
### Bug 37

TODO: Add assert that it throws exception

Seems that all cases after first just stem off issue where payment is negative.

## Time
### Bug 72

It seems that the subexpression output does not tell us if the input is null or
type, so we try both cases.