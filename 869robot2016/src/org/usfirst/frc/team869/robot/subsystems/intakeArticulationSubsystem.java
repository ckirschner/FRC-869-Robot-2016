package org.usfirst.frc.team869.robot.subsystems;

import org.usfirst.frc.team869.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team869.robot.commands.ArticulateIntakeCommand;

/**
 *
 */
public class IntakeArticulationSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static DoubleSolenoid articulateIntake = new DoubleSolenoid (RobotMap.articulateIntakeDownSolenoid, RobotMap.articulateIntakeUpSolenoid);
	
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    	setDefaultCommand(new ArticulateIntakeCommand());
    	
    	
    	
    }
    
    public void articulateIntakeDown (){
    	articulateIntake.set(DoubleSolenoid.Value.kForward);
    	
    }
    public void articulateIntakeUp (){
    	articulateIntake.set(DoubleSolenoid.Value.kReverse);
    	
    }
    public void articulateIntakeOff (){
    	articulateIntake.set(DoubleSolenoid.Value.kOff);
    	
    }
}

