
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

	}

}