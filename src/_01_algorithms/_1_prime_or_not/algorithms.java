package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog(null, "Give me a number");
		int primeAsInt = Integer.parseInt(prime);
		for (int i = 2; i < primeAsInt; i++) {
			if (primeAsInt % i == 0) {
				System.out.println("This is not a prime number");
				System.exit(0);
			}
		}
		System.out.println("This is a prime number");
	}
}
