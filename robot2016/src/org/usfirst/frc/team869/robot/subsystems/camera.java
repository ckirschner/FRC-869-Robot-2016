package org.usfirst.frc.team869.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team869.robot.commands.driveWithJoysticks;

import edu.wpi.first.wpilibj.CameraServer;
import org.usfirst.frc.team869.robot.commands.*;


/**
 *
 */
public class camera extends Subsystem {
	
	CameraServer server;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new streamCamera());
    }
    
    public void setCameraStream(String cameraName){
        server = CameraServer.getInstance();
        server.setQuality(50);
        //the camera name (ex "cam0") can be found through the roborio web interface
        server.startAutomaticCapture(cameraName);
        
        
    }

}

