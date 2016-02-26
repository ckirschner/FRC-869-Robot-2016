package org.usfirst.frc.team869.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class DriveShiftSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static DoubleSolenoid driveShifter = new DoubleSolenoid (0,1);
	
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void shiftHighSpeed (){
    	driveShifter.set(DoubleSolenoid.Value.kForward);
    	
    	
    }
    public static void shiftHighTorque (){
    	driveShifter.set(DoubleSolenoid.Value.kReverse);
    	
    	
    }
}

