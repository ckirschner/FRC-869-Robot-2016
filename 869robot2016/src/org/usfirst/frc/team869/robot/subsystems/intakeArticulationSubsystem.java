package org.usfirst.frc.team869.robot.subsystems;

import org.usfirst.frc.team869.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
<<<<<<< HEAD
<<<<<<< HEAD
import org.usfirst.frc.team869.robot.commands.ArticulateIntakeCommand;
=======
import org.usfirst.frc.team869.robot.commands.articulateIntakeDownCommand;
import org.usfirst.frc.team869.robot.commands.articulateIntakeUpCommand;
import org.usfirst.frc.team869.robot.commands.articulateIntakeOffCommand;
>>>>>>> parent of a60b4fc... finished most commands and all subsystems
=======
import org.usfirst.frc.team869.robot.commands.articulateIntakeDownCommand;
import org.usfirst.frc.team869.robot.commands.articulateIntakeUpCommand;
import org.usfirst.frc.team869.robot.commands.articulateIntakeOffCommand;
>>>>>>> parent of a60b4fc... finished most commands and all subsystems

/**
 *
 */
public class IntakeArticulationSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static int downPosition = 0;
	public static DoubleSolenoid articulateIntake = new DoubleSolenoid (RobotMap.articulateIntakeDownSolenoid, RobotMap.articulateIntakeUpSolenoid);
	
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
<<<<<<< HEAD
<<<<<<< HEAD

    	setDefaultCommand(new ArticulateIntakeCommand());
    	
=======
>>>>>>> parent of a60b4fc... finished most commands and all subsystems
=======
>>>>>>> parent of a60b4fc... finished most commands and all subsystems
    	
    	
    	//Make sure to only set the doublesolenoid to off if the last position of the intake was down
    	if (downPosition == 1){
    		setDefaultCommand(new articulateIntakeOffCommand());
    	} else {
    		setDefaultCommand(new articulateIntakeUpCommand());
    		
    	}
    }
    
    public static void articulateIntakeDown (){
    	articulateIntake.set(DoubleSolenoid.Value.kForward);
    	downPosition = 1;
    	
    }
    public static void articulateIntakeUp (){
    	articulateIntake.set(DoubleSolenoid.Value.kReverse);
    	downPosition = 0;
    	
    	
    }
    public static void articulateIntakeOff (){
    	articulateIntake.set(DoubleSolenoid.Value.kOff);
    	
    }
}

