#!/bin/bash
pushd Overfitting/ArjaE/StackQueue/bug48/Repaired
openjml -esc StackQueue.java -subexpressions > counterexamples.txt
popd

pushd Overfitting/ArjaE/StackQueue/bug51/Repaired
openjml -esc StackQueue.java -subexpressions > counterexamples.txt
popd

pushd Overfitting/ArjaE/StackQueue/bug56/Repaired
openjml -esc StackQueue.java -subexpressions > counterexamples.txt
popd

pushd Overfitting/Kali-A/StackQueue/bug27/Repaired
openjml -esc StackQueue.java -subexpressions > counterexamples.txt
popd

