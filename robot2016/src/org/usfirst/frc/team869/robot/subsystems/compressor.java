package org.usfirst.frc.team869.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Compressor;
import org.usfirst.frc.team869.robot.commands.enableCompressor;



/**
 *
 */
public class compressor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor robotCompressor = new Compressor(0);
	
	
	
	//robotCompressor.setClosedLoopControl(true);
	
	
	
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	
    	//Set default command to enable compressor. SHould actually only need to set this as initialization. Check this later
    	setDefaultCommand(new enableCompressor());
    	
    	
    	
    }
    
    public void enableCompressor (boolean enabled){
    	
    //	robotCompressor ();
    	
    	robotCompressor.setClosedLoopControl(true);
    	
    	
    	
    }

}

