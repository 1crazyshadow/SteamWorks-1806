package org.usfirst.frc.team1806.robot;

public class Constants {
		
	//--------------------------FLYWHEEL---------------------------------
	// Flywheel PID constants, set in Flywheel Subststem
	public final double flyWheelP = .002375;
	public final double flyWheelI = 0;
	public final double flyWheelD = 0;
	public final double flyWheelF = -.04375;
	
	// This is for the shooter RPM range, adjust this if needed
	public final double minShooterRange = 1880;
	// cam u are in the code 
	public final static double camCoder = 1980;
	public final double maxShooterRange = 2080;
	
	// This is the coast range, measure this after every change min - coast, not sure if used
	public final double coastRange = 345;
	
	//-------------------------- INTAKE ---------------------------------
	public final double intakeSpeed = .7;
}
