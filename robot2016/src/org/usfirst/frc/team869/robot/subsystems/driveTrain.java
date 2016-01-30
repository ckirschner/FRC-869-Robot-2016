package org.usfirst.frc.team869.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team869.robot.commands.*;
import org.usfirst.frc.team869.robot.OI;
import org.usfirst.frc.team869.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;;


//import org.usfirst.frc.team869.robot.commands.driveWithJoysticks;

/**
 *
 */
public class driveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	//Create the talons for the drive Train.
	CANTalon talonFrontLeft = new CANTalon (RobotMap.leftFrontDriveMotor);
	CANTalon talonRearLeft = new CANTalon (RobotMap.leftRearDriveMotor);
	CANTalon talonFrontRight = new CANTalon (RobotMap.rightFrontDriveMotor);
	CANTalon talonRearRight = new CANTalon (RobotMap.rightRearDriveMotor);
	
	
	

    public void initDefaultCommand() {
    	
    	setDefaultCommand(new driveWithJoysticks());
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setTankDrive (double rightSpeed, double leftSpeed){
    	//Set left and right speeds. Invert left value to accommodate motors spinning on the mirrored side.
    	talonFrontLeft.set(-(leftSpeed));
    	talonRearLeft.set(-(leftSpeed));
    	talonFrontRight.set(rightSpeed);
    	talonRearRight.set(rightSpeed);
    	
    }
    
 
    
}

