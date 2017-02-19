package org.usfirst.frc.team1806.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Left Motors from Top to Bottom
	 public static int leftMotor = 1;
	 public static int rightMotor = 0;
	 
	 // hopper motor
	 public static int hopperMotor = 1;
	 
	 // conveyor motor
	 public static int conveyorMotor = 2;
	 
	 //Shooter boi
	 public static int flyWheel = 0;
	 
	 //for that little shifter ;)
	 public static int shiftLow = 6;
	 public static int shiftHigh = 7;
	 
	 // intake 
	 public static int intake = 3;
	 // our two climbers
	 public static int climber = 4;
	 public static int climber1 = 5;
	 
	 // two solenoides for our gear holder
	 public static int gearHolderOut = 5;
	 public static int gearHolderIn = 4;

}
