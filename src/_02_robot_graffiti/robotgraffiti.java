package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
	public static void main(String[] args) {
Robot rob = new Robot();
rob.penDown();
rob.setSpeed(100);
rob.move(100);
rob.turn(130);
rob.move(80);
rob.turn(100);
rob.move(80);
rob.hide();
}
}
