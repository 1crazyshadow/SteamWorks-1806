package org.usfirst.frc.team1806.robot;

public class States {
	public enum IntakeStates{
		INTAKE,STOPPED,OUTTAKE
	}
	public enum Conveyor{
		RUNNING,STOPPED
	}
	public enum Shifter{
		HIGH, LOW
	}
	public enum ShootSpeed{
		RUNNING, IDLE, STOPPED
	}
	public enum Driving{
		DRIVING,AIMING,CREEP
	}
	public enum Climber{
		RUNNINGATSPEED, STOPPED
	}
	public enum Hopper{
		RUNNING,STOPPED
	}
	public enum GearHolder{
		IN, OUT
	}
	public IntakeStates intakeStatesTracker;
	public Conveyor conveyorTracker;
	public Shifter shifterTracker;
	public ShootSpeed shootSpeedTracker;
	public Driving drivingTracker;
	public Climber climberTracker;
	public Hopper hopperTracker;
	public GearHolder gearTracker;
	public void resetStates(){
		hopperTracker = Hopper.STOPPED;
		climberTracker = Climber.STOPPED;
		intakeStatesTracker = IntakeStates.STOPPED;
		conveyorTracker = Conveyor.STOPPED;
		shifterTracker = Shifter.LOW;
		drivingTracker = Driving.DRIVING;
		shootSpeedTracker = ShootSpeed.STOPPED;
		gearTracker = GearHolder.OUT;
	}
}
