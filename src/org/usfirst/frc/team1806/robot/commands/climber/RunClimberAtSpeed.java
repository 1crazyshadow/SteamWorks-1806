package org.usfirst.frc.team1806.robot.commands.climber;

import org.usfirst.frc.team1806.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunClimberAtSpeed extends Command {
	double lol;
    public RunClimberAtSpeed(double power) {
    	lol = power;
        // Use requires() here to declare subsystem dependencies
        requires(Robot.climberSS);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climberSS.climbAtSpeed(lol);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
