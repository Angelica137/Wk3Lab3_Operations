# Week3 Lab3 - Operators

## Exercise One

Write a program Operators that reads an operation and two integers from the command line, then performs the operation on the numbers and prints out the result. For example the command line:

- java Operators add 7 9
- 7 + 9 = 16

Implement the operations add and subtract. The program should print error messages if an unknown operation or a non-integer is entered. So the following errors would be handled.

- java Operators add 7 9.9
- error cannot convert 7 and 9.9 to integers

Tip: you can use Integer.parseInt(s) to convert a String to an int. This operation throws a NumberFormatException. Have a look at p.401 of the Java book for the try/catch logic.

### How to run the program

enter

```
javac Operators.java
java Operators
```

You will see "java Operators" in the command line
enter the operator you want to carry out and the integers you want the operation to be carried on, for example:

```
add 2 2
```

To meet requirements these are to be entered on the same line as the copy displayed when the program is started, so once you are done entering your commands, the command line will look like this:

```
java Operators add 2 2
```

once you hit enter, the result will be calculated and you will see your answer in the command line

### Future

- refactor if else statments
- it would be good if I can autmate the testing
- user errors need to be considered and added
