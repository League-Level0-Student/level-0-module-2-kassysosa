import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {
	static Robot purple = new Robot();

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "Do you want a square, triangle, or circle?");
		{
			if (answer.equals("square")) {
				drawSquare();
			} else if (answer.equals("triangle")) {
				drawTriangle();
			} else if (answer.equals("circle")) {
				drawCircle();
			}

		}

	}

	public static void drawSquare() {
		purple.penDown();
		purple.setSpeed(20);
		purple.move(300);
		purple.turn(90);
		purple.move(300);
		purple.turn(90);
		purple.move(300);
		purple.turn(90);
		purple.move(300);
	}

	public static void drawTriangle() {
		purple.penDown();
		purple.setSpeed(20);
		purple.setPenColor(Color.yellow);
		purple.move(100);
		purple.turn(150);
		purple.move(300);
		purple.turn(90);
		purple.move(175);
		purple.turn(120);
		purple.move(210);
	}

	public static void drawCircle() {
		purple.penDown();
		purple.setSpeed(500);
		for (int i = 0; i < 360; i++) {
			purple.move(1);
			purple.turn(360 / 360);
		}
	}

}