package org.usfirst.frc.team869.robot.subsystems;

import org.usfirst.frc.team869.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class intakeSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/*
	 * at 11.9V the motor runs at 4450
	 */
	
	CANTalon talonIntake = new CANTalon (RobotMap.intakeMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void setIntakeSpeed (double intakeSpeed){
    	//Set intake drive speed
    	talonIntake.set((intakeSpeed));
    	System.out.print("running drive train");	
    }

}



