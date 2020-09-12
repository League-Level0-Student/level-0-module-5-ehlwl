package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ReturnTypesAdvanced {
	static Robot rob = new Robot();
	
	public static void main(String[] args) {
		//1. Ask the user how many sides they want their shape to be
		
		//2. Call canMakeShape() and save what is returned into a variable
		
		//3. If the shape CAN be drawn
		
			//4. Call and save what is returned from calculateTurningAngle()
		
			//5. Use drawPolygon() to draw your shape
		
		//6. If the shape CANNOT be drawn 
			
			//7. Call notEnoughSides() and print out what is returned 
	
	}
	
	static int calculateTurnAngle(int numSides) {
		int angle = 180-(((numSides-2)*180)/numSides);
		return angle;
	}
	
	static void drawPolygon(int numSides, int degrees) {
		rob.setSpeed(100);
		rob.penDown();
		for(int i = 0; i < numSides; i++) {
			rob.move(100);
			rob.turn(degrees);
		}
		rob.hide();
	}
	
	static boolean canMakeShape(int numSides) {
		if(numSides >= 3) {
			return true;
		}
		return false;
	}
	
	static String notEnoughSides() {
		return "I'm sorry we cannot make a shape with that many sides\n"
				+ "Please enter a number greater than 2";
	}
}
