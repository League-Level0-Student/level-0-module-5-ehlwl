package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String p = JOptionPane.showInputDialog("what kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		while (happinessLevel < 5) {
		int task = JOptionPane.showOptionDialog(null, "what are you gonna do for your pet?", p, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "give food", "take a walk", "cuddle" }, null);
		if (task == 0) {
			giveFood(); 
			happinessLevel= happinessLevel+1;
		}
		if (task == 1) {
			takeWalk();
			happinessLevel= happinessLevel+1;
		}
	
		if (task == 2) {
			cuddle(); 
			happinessLevel= happinessLevel+1;
		}
		}
		JOptionPane.showMessageDialog(null, "you love your "+p+"!");
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

		// 4. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		
		// and INCREMENT the pet's happiness Level.

	}

	private static void cuddle() {
		JOptionPane.showMessageDialog(null,"your pet likes it!");
		
	}

	private static void takeWalk() {
		JOptionPane.showMessageDialog(null, "your pet is excited!");
		
	}

	public static void giveFood() {
		JOptionPane.showMessageDialog(null, "nice! your pet was hungry"); 
	}
}