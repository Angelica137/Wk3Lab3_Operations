
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

	// transform user input into String and Integers
	public String[] formatString() {
		String[] words = getInput().split("\\s");
		return words;
	}

	// check the first thing the user entered
	public String operator() {
		if (formatString()[0].equals("add")) {
			return "+";
		} else if (formatString()[0].equals("sum")) {
			return "+";
		} else if (formatString()[0].equals("substract")) {
			return "-";
		} else if (formatString()[0].equals("multiply")) {
			return "*";
		} else if (formatString()[0].equals("mult")) {
			return "*";
		} else if (formatString()[0].equals("divide")) {
			return "/";
		} else if (formatString()[0].equals("div")) {
			return "/";
		} else {
			return "We do not decognise that operator";
		}
	}

	// extract the first integers
	public Integer firstInt() {
		Integer int1 = Integer.parseInt(formatString()[1]);
		return int1;
	}

	// extract the 2n integer
	public Integer secondInt() {
		Integer int2 = Integer.parseInt(formatString()[2]);
		return int2;
	}

	// carry out operation
	public Integer result() {
		Integer result;
		if (operator().equals("+")) {
			return result = firstInt() + secondInt();
		} else if (operator().equals("-")) {
			return result = firstInt() - secondInt();
		} else if (operator().equals("*")) {
			return result = firstInt() * secondInt();
		} else if (operator().equals("/")) {
			return result = firstInt() / secondInt();
		} else {
			return 404;
		}
	}
}