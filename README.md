# Week3 Lab3 - Operators

## Exercise One

Write a program Operators that reads an operation and two integers from the command line, then performs the operation on the numbers and prints out the result. For example the command line:

- java Operators add 7 9
- 7 + 9 = 16

Implement the operations add and subtract. The program should print error messages if an unknown operation or a non-integer is entered. So the following errors would be handled.

- java Operators add 7 9.9
- error cannot convert 7 and 9.9 to integers

Tip: you can use Integer.parseInt(s) to convert a String to an int. This operation throws a NumberFormatException. Have a look at p.401 of the Java book for the try/catch logic.

### Future

refactor if else statments
it would be good if I can autmate the testing
