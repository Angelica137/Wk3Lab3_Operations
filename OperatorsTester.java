
// test Operators class
import java.util.Scanner;

public class OperatorsTester {
	public static void main(String[] args) {
		// test instantiate object from user intput
		Scanner user_input = new Scanner(System.in);
		System.out.print("java Operators ");
		String command = user_input.nextLine();
		Operators o = new Operators(command);
		System.out.println(o);

		// test .getInput() returns user input
		System.out.println(o.getInput());

		// test .formatString
		System.out.println(o.formatString());
		System.out.println(o.formatString()[0]);

		// test .operator() returns the char corresponding to operator entered
		System.out.println(o.operator());

		// test returning the 1st and 2ndinteger
		System.out.println(o.firstInt());
		System.out.println(o.secondInt());

		// test .result() returns result from operation
		System.out.println(o.result());

		// test .answer() prints formated answer to terminal
		o.answer();
	}

}