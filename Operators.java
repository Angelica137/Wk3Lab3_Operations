
// Operator class takes user input from terminal
// carries operation and displays result
import java.util.Scanner;

public class Operators {

	// atributes
	private String input;

	// constructor
	public Operators(String inputIn) {
		input = inputIn;
	}

	// getter
	public String getInput() {
		// gets the string the user entered
		return input;
	}

	// get input from command line
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.print("java Operators ");
		String command = user_input.next();

		// instantiae an object from user input
		Operators o1 = new Operators(command);
		System.out.println(o1);
	}
}
