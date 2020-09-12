package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ReturnTypesRobot {
	static Robot rob = new Robot("mini");
	static int totalDistance;
	
	public static void main(String[] args) {
		//1. Call the crazyMove() method to move the robot
		
		//2. Call the getTotalDistanceMethod() to get the distance the robot moved
		
		//3. If the distance is greater than 500
			
			//4. Tell the user "Wow! That's really far!"
		
		//5. Else use a pop up to say "Better luck next time."
		
	}
	
	static void crazyMove() {
		rob.setY(500);
		rob.setSpeed(100);
		rob.penDown();
		int numMoves = new Random().nextInt(41)+10;
		for (int i = 0; i < numMoves; i++ ) { 
			rob.setAngle(0);
			if(i%2==0) {
				rob.turn(45);
			}
			else {
				rob.turn(-45);
			}
			int dist = new Random().nextInt(31);
			rob.move(dist);
			totalDistance+=dist;
		}
	}
	
	static int getTotalDistance() {
		return totalDistance;
	}
	
}
