import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot purple = new Robot();
		purple.moveTo(10, 550);
		Robot.setWindowColor(Color.black);
		Random h = new Random();
		
		for (int i = 0; i < 10; i++) {
	int height = h.nextInt(401)+100;
			purple.setRandomPenColor();
		
		purple.penDown();
		purple.setSpeed(40);
		purple.move(height);
		purple.turn(90);
		purple.move(70);
		purple.turn(90);
		purple.move(height);
		purple.turn(270);
		purple.move(20);
		purple.turn(270);

if(height < 30) {
	
}
		
		}
	}
}
