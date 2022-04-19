package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 99; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 500; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd");
			} else if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
		}
		for (int i = 0; i < 784; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2006; i < 2023; i++) {
			int age = i - 2006;
			System.out.println("in " + i + ", I was " + age + " years old");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i);
				System.out.print(j);
				System.out.println();
			}
		}
		for (int i=1; i<=7; i+=3) {
			System.out.println();
			for (int j=0; j<=2; j++) {
				System.out.print(i + j);
			}
		}
		for (int i=1; i<=100; i+=10) {
			System.out.println();
			for (int j=0; j<=9; j++) {
				System.out.print(i);
				System.out.print(j);
			}
		}
	}

}
