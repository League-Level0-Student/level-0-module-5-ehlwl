package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractive {
		public static void main(String[] args) {

		skillPractive skills = new skillPractive();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

		String d = JOptionPane.showInputDialog("how many dimes do you have?");
		int a = (int) Integer.parseInt(d);
		a = a*10;
		JOptionPane.showMessageDialog(null, "you have "+a+" cents");

		// Tell them how many cents they have (hint multiply by 10)




		// Ask the user how tall they are (inches)

		String t = JOptionPane.showInputDialog("how tall are you in inches?");
		int r = (int) Integer.parseInt(t);
		if (r<36) {
			JOptionPane.showMessageDialog(null, "eat wheaties!");
		}


		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i=1;i<31;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console

		

		// Get another random number that is less than 10 and print it to the console

		

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction



		}

		void skill4() { // In a pop-up, ask the user for the city they live in



		// If they answered "San Diego", tell them they live in America's Finest City



		// Otherwise, tell them to move to San Diego



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."



		// If there is 1 car, use a pop-up to display the make/model of the car



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



		}

		void skill5() { // In a pop-up, ask the user for the name of their school



		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



		}
		}

