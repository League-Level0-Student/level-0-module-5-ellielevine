package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String type = JOptionPane.showInputDialog("What type of pet do you want: Dog, Fish, or Hamster?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
while (happinessLevel >= -300) {
		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Activities", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "walk", "food", "groom" }, null);

		// 6. Use user input to call the appropriate method created in step 5 below.
		
if (task == 0) {
	walk(type);
}
else if (task == 1) {
	food(type);
}
else if (task == 2) {
	groom(type);
}

		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if (happinessLevel <= -300) {
JOptionPane.showMessageDialog(null, "You hate your pet It is " + happinessLevel + " happy");	
}
else if (happinessLevel>= 300) {
	JOptionPane.showMessageDialog(null, "You Love your pet! it is " + happinessLevel + " happy!");
}


	}
	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void walk(String type) {
		if (type.equalsIgnoreCase("Dog")) {
			happinessLevel += 100;
			JOptionPane.showMessageDialog(null, "Dog wags tail");
		} else if (type.equalsIgnoreCase("Fish")) {
			happinessLevel -= 70;
			JOptionPane.showMessageDialog(null, "You fish can't breathe out of the water! not a fan of exercise");
		} else if (type.equalsIgnoreCase("hamster")) {
			happinessLevel += 5;
			JOptionPane.showMessageDialog(null, "Your hamster prefers running on its spinny thing");
		}
	}

	public static void food(String type) {
		if (type.equalsIgnoreCase("Dog")) {
			happinessLevel += 110;
			JOptionPane.showMessageDialog(null, "Yum, your dog wags its tail");
		} else if (type.equalsIgnoreCase("Fish")) {
			happinessLevel += 100;
			JOptionPane.showMessageDialog(null, "Your fish comes to the top to eat");
		} else if (type.equalsIgnoreCase("hamster")) {
			happinessLevel += 100;
			JOptionPane.showMessageDialog(null, "You hamster retrieves its food and hides under its house");
		}
	}

	public static void groom(String type) {
		if (type.equalsIgnoreCase("Dog")) {
			happinessLevel -= 90;
			JOptionPane.showMessageDialog(null, "Your dog trys to shake the water off, its mad");
		} else if (type.equalsIgnoreCase("Fish")) {
			happinessLevel += 20;
			JOptionPane.showMessageDialog(null, "your fish enjoys a clean tank");
		} else if (type.equalsIgnoreCase("hamster")) {
			happinessLevel -= 50;
			JOptionPane.showMessageDialog(null, "you hamster doesnt love to be wet");
		}
	}
}