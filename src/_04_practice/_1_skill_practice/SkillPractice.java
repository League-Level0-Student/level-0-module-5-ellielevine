package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		// String dimesString = JOptionPane.showInputDialog("How many dimes do you
		// have?");
		// int dimes = Integer.parseInt(dimesString);
		// JOptionPane.showMessageDialog(null, "You have " + dimes * 10 + " cents");
		// String heightString = JOptionPane.showInputDialog("How many inches tall are
		// you?");
		// int height = Integer.parseInt(heightString);
		// if (height <= 36) {
		// JOptionPane.showMessageDialog(null, "Eat More Wheaties");
		// }

		// for(int count = 3; count<31; count +=3) {
		// System.out.print(count);
		// }

		// int number;
		// int number1;
		// Random ran = new Random ();
		// number = ran.nextInt(20);
		// System.out.println(number);
		// number1 = ran.nextInt(10);
		// System.out.println(number1);
		// int number2 = number - number1;
		// System.out.println("The difference between the two random numbers is " +
		// number2);

		// String city = JOptionPane.showInputDialog("What city do you live in?");
		// if (city.equalsIgnoreCase("San Diego")) {
		// JOptionPane.showMessageDialog(null, "You live in America's finest city");
		// } else {
		// JOptionPane.showMessageDialog(null, "Move to san diego");
		// }
		// String carsString = JOptionPane.showInputDialog("How many cars do you
		// have?");
		// int cars = Integer.parseInt(carsString);
		// if (cars > 1) {
		// JOptionPane.showMessageDialog(null, "There are " + cars * 4 + " wheels in
		// total");
		// } else if (cars == 0) {
		// JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		// } else if (cars == 1) {
		// JOptionPane.showMessageDialog(null, "Your car is a honda minivan");
		// }
		
		String school = JOptionPane.showInputDialog("What is the name of your school?");
		JOptionPane.showMessageDialog(null, "Your school, " +school+ ", is amazing!");
	}
}
