package org.usfirst.frc.team1806.robot.commands.red;

import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.commands.Wait;
import org.usfirst.frc.team1806.robot.commands.conveyor.StartConveyor;
import org.usfirst.frc.team1806.robot.commands.conveyor.StopConveyor;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.DriveToPosition;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.RunDrive;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.TurnToAngle;
import org.usfirst.frc.team1806.robot.commands.drivetrain.auto.VisionDriveStraight;
import org.usfirst.frc.team1806.robot.commands.flywheel.StartFlywheel;
import org.usfirst.frc.team1806.robot.commands.flywheel.StopFlywheel;
import org.usfirst.frc.team1806.robot.commands.gear.ExtendGear;
import org.usfirst.frc.team1806.robot.commands.hopper.RunHopper;
import org.usfirst.frc.team1806.robot.commands.hopper.StopHopper;
import org.usfirst.frc.team1806.robot.commands.intake.StartIntake;
import org.usfirst.frc.team1806.robot.commands.sequences.Shimmy;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BoilerandGear extends CommandGroup {
	
    public BoilerandGear() {
//		addSequential(new StartFlywheel());
//		addParallel(new StartConveyor());
//		addParallel(new RunHopper());
//		addSequential(new Wait(4));
//		addSequential(new StopHopper());
//		addSequential(new StopConveyor());
//		addSequential(new StopFlywheel());
//		addSequential(new ExtendGear());
//		addSequential(new TurnToAngle(-50, .7, 2));
//		addSequential(new StartIntake());
		addSequential(new DriveToPosition(36, 1, 1.5));
//		addSequential(new TurnToAngle(-55, .7, 2.5));
//		addSequential(new VisionDriveStraight(.4, Robot.driveSS.getVisionAngle(), 44));
//		addSequential(new Shimmy());
//		addSequential(new Wait(2));
//		addSequential(new RunDrive(-.3, 0, .3));
//		addSequential(new RunDrive(.3, 0, .3));
//		addSequential(new Shimmy());
    }
}
