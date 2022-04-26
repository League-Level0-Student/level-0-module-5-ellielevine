package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robot = new Robot();

	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape do you want: Square, Triangle, or circle?");
		String color = JOptionPane.showInputDialog("What color do you want your" + shape + "? Red or Blue?");
		if (color.equalsIgnoreCase("red")) {
			robot.setPenColor(255, 0, 0);
		} else if (color.equalsIgnoreCase("blue")) {
			robot.setPenColor(0, 0, 255);
		}
		if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else if (shape.equalsIgnoreCase("Circle")) {
			drawCircle();
		}

	}

	public static void drawSquare() {
		robot.penDown();
		robot.setSpeed(15);
		for (int i = 0; i < 4; i++) {
			robot.move(100);
			robot.turn(90);
		}
	}

	public static void drawTriangle() {
		robot.penDown();
		robot.setSpeed(15);
		for (int i = 0; i < 3; i++) {
			robot.move(100);
			robot.turn(120);
		}
	}

	public static void drawCircle() {
		robot.penDown();
		robot.setSpeed(50);
		for (int i = 0; i < 30; i++) {
			robot.move(12);
			robot.turn(12);
		}

	}
}
