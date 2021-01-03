package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot r = new Robot();
	public static void main(String[] args) {
		
		r.setSpeed(20);
		r.penDown();
		String a = JOptionPane.showInputDialog("choose the shape between square, triangle, and circle");
		String b = JOptionPane.showInputDialog("choose the color between black, red, blue, and green");
		if (b.equals("red")) {
			r.setPenColor(200, 0, 0);
		}
		else if (b.equals("green")) {
			r.setPenColor(0,200,0);
		}
		else if (b.equals("blue")) {
			r.setPenColor(0,0,200);
		}
		if (a.equals("square")) {
			drawSquare();
		}
		else if (a.equals("triangle")) {
			drawTriangle();
		}
		else if (a.equals("circle")) {
			drawCircle();
		}
			
		}
	

	private static void drawSquare() {
		for (int i=0;i<4;i++) {
			r.move(200);
			r.turn(90);
			}
		
	}
	private static void drawTriangle() {
		for (int i=0;i<3;i++) {
			r.move(200);
			r.turn(120);
		}
	}
	private static void drawCircle() {
		r.setSpeed(100);
		for (int i=0;i<360;i++) {
			r.move(1);
			r.turn(1);
		}
	}
}
