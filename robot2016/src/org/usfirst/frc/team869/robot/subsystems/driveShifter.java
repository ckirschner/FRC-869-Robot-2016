package org.usfirst.frc.team869.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;



/**
 *
 */
public class driveShifter extends Subsystem {
	
	DoubleSolenoid speedSolenoid = new DoubleSolenoid (0,1);
	
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shiftHighSpeed(){
    	
    	speedSolenoid.set(DoubleSolenoid.Value.kForward);
    	
    	//System.out.print("HighSpeed Shift");
    	
    	
    	
    }
    public void shiftHighTorque(){
    	
    	speedSolenoid.set(DoubleSolenoid.Value.kReverse);
    	
    	
    	
    }
}

