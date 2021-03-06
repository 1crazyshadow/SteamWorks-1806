package org.usfirst.frc.team1806.robot.commands.climber;

import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.States.Climber;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopClimber extends Command {

    public StopClimber() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climberSS);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.states.climberTracker = Climber.STOPPED;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climberSS.climber.set(0);

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
