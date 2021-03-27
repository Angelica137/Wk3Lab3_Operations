
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
			return " + ";
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
}