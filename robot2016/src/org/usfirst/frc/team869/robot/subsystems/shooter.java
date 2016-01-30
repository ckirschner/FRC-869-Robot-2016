package org.usfirst.frc.team869.robot.subsystems;

import org.usfirst.frc.team869.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	CANTalon talonShooter = new CANTalon (RobotMap.shooterMotor);
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    
    }
    
    public void setShooterSpeed (double shooterSpeed){
    	//Set left and right speeds. Invert left value to accommodate motors spinning on the mirrored side.
    	talonShooter.set(shooterSpeed);

    	
    }
}

