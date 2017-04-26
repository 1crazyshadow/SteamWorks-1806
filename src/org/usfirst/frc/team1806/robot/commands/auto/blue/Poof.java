package org.usfirst.frc.team1806.robot.commands.auto.blue;

import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.commands.Wait;
import org.usfirst.frc.team1806.robot.commands.conveyor.StartConveyor;
import org.usfirst.frc.team1806.robot.commands.conveyor.StopConveyor;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.BoilerTurnToAngle;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.DriveToPosition;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.RunDrive;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.VisionDriveStraight;
import org.usfirst.frc.team1806.robot.commands.flywheel.StartFlywheel;
import org.usfirst.frc.team1806.robot.commands.flywheel.StopFlywheel;
import org.usfirst.frc.team1806.robot.commands.gear.ExtendGear;
import org.usfirst.frc.team1806.robot.commands.gear.RectractGear;
import org.usfirst.frc.team1806.robot.commands.hopper.RunHopper;
import org.usfirst.frc.team1806.robot.commands.hopper.StopHopper;
import org.usfirst.frc.team1806.robot.commands.sequences.Shimmy;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Poof extends CommandGroup {

    public Poof() {
    	//TODO, make it work????
    	addSequential(new RectractGear());
    	addSequential(new DriveToPosition(30, .5,0, 2));
    	addSequential(new VisionDriveStraight(.5, Robot.driveSS.getVisionAngle(), 25));
    	addSequential(new DriveToPosition(10, .27,0, 2));
    	addSequential(new Shimmy());
		addSequential(new Wait(5));
		addSequential(new RunDrive(-.3, 0, .7));
		addSequential(new RunDrive(.3, 0, .7));
		addSequential(new Shimmy());
		////////////
		addSequential(new DriveToPosition(20, .5, .3, 2));
		addSequential(new DriveToPosition(48, .5, 0, 3));
		addSequential(new BoilerTurnToAngle(2));
		///////////
		addParallel(new StartFlywheel());
		addSequential(new Wait(1));
		addSequential(new StartConveyor());
		addSequential(new RunHopper());
		addSequential(new Wait(2));
		addSequential(new StopConveyor());
		addSequential(new StopFlywheel());
		addSequential(new RectractGear());
    }
}
