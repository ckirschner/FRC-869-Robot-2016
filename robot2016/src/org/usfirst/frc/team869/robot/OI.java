package org.usfirst.frc.team869.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team869.robot.commands.shiftDriveSpeed;
import org.usfirst.frc.team869.robot.commands.*;
//import edu.wpi.first.wpilibj.vision.USBCamera;
import edu.wpi.first.wpilibj.CameraServer;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	
	public static Joystick driverController = new Joystick(RobotMap.driverControllerID);
	public static Joystick operatorController = new Joystick(RobotMap.operatorControllerID);
	//public static JoystickButton joystickButtonA = new JoystickButton(driverController, RobotMap.logitechControllerAbutton);
	
	
	
	//public static shiftDriveSpeed shiftHigh = new shiftDriveSpeed();
	
	
	
	
	public OI() {
		
		//joystickButtonA.whenPressed(shiftHigh);
		
		getButton(RobotMap.driverControllerID, RobotMap.logitechControllerAbutton)
        .whileHeld(new shiftDriveSpeed());
		
		//new JoystickButton(driverController, RobotMap.logitechControllerYbutton).whenPressed(new driveShift(RobotMap.logitechControllerYbutton));
		
		
	}
	
	
	
	
	
		
	//public static USBCamera microSoftCam = new USBCamera("cam0");
	
		/*shiftHighSpeed.whenPressed(new driveShift());
	
		shiftHighSpeed.whenPressed(new driveShift(RobotMap.driveHighSpeed));
		shiftHighTorque.whenPressed(new driveShift(RobotMap.driveHighTorque));*/
		
		
		
	public static double getLeftDriveSpeed(){
		return driverController.getRawAxis(RobotMap.logitechControllerLYAxis);
	}

	public static double getRightDriveSpeed(){
		return driverController.getRawAxis(RobotMap.logitechControllerRYAxis);
	}

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	
    public JoystickButton getButton(int joyid, int button) {
        switch(joyid) {
            case RobotMap.driverControllerID:
                return new JoystickButton(driverController, button);
          /*  case RobotMap.rightJoystick:
                return new JoystickButton(rightJoy, button);*/
            case RobotMap.operatorControllerID:
                return new JoystickButton(operatorController, button);
            default:
                return null;
        }
    }
}

