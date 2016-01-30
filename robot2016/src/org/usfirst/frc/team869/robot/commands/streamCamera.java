package org.usfirst.frc.team869.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team869.robot.OI;
import org.usfirst.frc.team869.robot.Robot;
import org.usfirst.frc.team869.robot.RobotMap;
import org.usfirst.frc.team869.robot.subsystems.*;

/**
 *
 */
public class streamCamera extends Command {

    public streamCamera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.cameraSystem);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.cameraSystem.setCameraStream(RobotMap.usbCameraName);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
