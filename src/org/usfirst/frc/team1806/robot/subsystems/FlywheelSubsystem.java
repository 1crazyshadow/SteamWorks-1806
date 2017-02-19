package org.usfirst.frc.team1806.robot.subsystems;

import java.lang.Thread.State;

import org.usfirst.frc.team1806.robot.Constants;
import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.RobotMap;
import org.usfirst.frc.team1806.robot.States;
import org.usfirst.frc.team1806.robot.States.Conveyor;
import org.usfirst.frc.team1806.robot.States.ShootSpeed;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
public class FlywheelSubsystem extends Subsystem {
	CANTalon flyWheel;
	Talon conveyor;
	States states;
	Constants constants;
	public FlywheelSubsystem(){
		flyWheel = new CANTalon(RobotMap.flyWheel);
		flyWheel = new CANTalon(0);
		
		flyWheel.setControlMode(0);
        flyWheel.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
		flyWheel.setProfile(0);
    	flyWheel.setInverted(false);
    	flyWheel.reverseOutput(false);
    	flyWheel.reverseSensor(false);		
    	conveyor = new Talon(RobotMap.conveyorMotor);
		constants = new Constants();
		//flyWheel.setPID(constants.flyWheelP, constants.flyWheelI, constants.flyWheelD);
	}
	public void setP(double p){
		flyWheel.setP(p);
	}
	public void setI(double i){
		flyWheel.setI(i);
	}
	public void setD(double d){
		flyWheel.setD(d);
	}
	public void setIdleSpeed(){
		// probably not used RIP sorru desu desu 
		states.shootSpeedTracker = States.ShootSpeed.IDLE;
		setRPMMode();
		flyWheel.set(500);
	}
	public void setToShootingSpeed(){
		setRPMMode();
		setShooterRPM(constants.camCoder);
	}
	public boolean isAtShootingSpeed(){
		if(getRPM() > constants.minShooterRange && getRPM() < constants.maxShooterRange){
			return true;
		} else {
			return false;
		}
	}
	public void stopFlyWheel(){
		setPowerMode();
		flyWheel.set(0);
		
	}
	public void setPowerMode(){
		// remember Power mode is always negative to be the right way
		flyWheel.changeControlMode(TalonControlMode.PercentVbus);
	}
	public void setRPMMode(){
		// Remember RPM mode is always postitive
		flyWheel.changeControlMode(TalonControlMode.Speed);
	}
	public double getRPM(){
		// this always returns positive
		return flyWheel.getSpeed();
	}
	public double getPower(){
		// this will return negative
		return flyWheel.getOutputVoltage() / flyWheel.getBusVoltage();
		
	}
	public void setShooterPower(double power){
		setPowerMode();
		flyWheel.set(power);
	}
	public void setShooterRPM(double power){
		setRPMMode();
		flyWheel.set(power);
	}
	public void setConveyor(){
		Robot.states.conveyorTracker = Conveyor.RUNNING;
		conveyor.set(-Constants.conveyorSpeed);
	}
	public void stopConveyor(){
		Robot.states.conveyorTracker = Conveyor.STOPPED;
		conveyor.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
