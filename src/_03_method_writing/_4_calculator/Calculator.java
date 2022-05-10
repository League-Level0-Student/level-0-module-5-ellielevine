package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	// GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses

		// 4) Call the result() method and put the answer in a pop-up
		result(task, number1, number2);
	}

	// 1) Make 4 static methods (add, subtract, multiply, divide)
	// They should each take 2 numbers as parameters
	// and return the answer.
	public static int divide(int number1, int number2) {
		return number1 / number2;
	}

	public static int multiply(int number1, int number2) {
		return number1 * number2;
	}

	public static int subtract(int number1, int number2) {
		return number1 - number2;
	}

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	// 2) Make a static method called " result" that takes a number
	// as a parameter and returns the number in a string
	// EX: "Your answer is " + number;

	public static void result(int task, int number1, int number2) {
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "Your answer is " + divide(number1, number2));
		} else if (task == 1) {
			JOptionPane.showMessageDialog(null, "Your answer is " + multiply(number1, number2));
		} else if (task == 2) {
			JOptionPane.showMessageDialog(null, "Your answer is " + subtract(number1, number2));
		} else if (task == 3) {
			JOptionPane.showMessageDialog(null, "Your answer is " + add(number1, number2));
		}
	}
}
