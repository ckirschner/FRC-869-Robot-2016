package org.usfirst.frc.team869.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	
	
	public static final int driverControllerID = 1;

	public static final int operatorControllerID = 2;
	
	
	
	public static String usbCameraName = "cam0";
	
	//***************************************************************************
	//ACTUAL MAP FOR THE LOGITECH CONTROLLER
	//******************DO NOT CHANGE THIS***************************************
	//"Controller Gampad (F310)" Button mapping
	public static int logitechControllerAbutton = 1;
	public static int logitechControllerBbutton = 2;
	public static int logitechControllerXbutton = 3;
	public static int logitechControllerYbutton = 4;
	public static int logitechControllerLBbutton = 5;
	public static int logitechControllerRBbutton = 6;
	public static int logitechControllerBackbutton = 7;
	public static int logitechControllerStartbutton = 8;
	public static int logitechControllerLStickButton = 9;
	public static int logitechControllerRStickButton = 10;

	//"Controller Gampad (F310)" Axis Numbers
	public static int logitechControllerLXAxis = 0;
	public static int logitechControllerLYAxis = 1;
	public static int logitechControllerLTrigger = 2;
	public static int logitechControllerRTrigger = 3;
	public static int logitechControllerRXAxis = 4;
	public static int logitechControllerRYAxis = 5;
	//*****************************************************************************
	
	
	
	
	/* 
	 * Define motors for drive train here
	 * CANBUS values
	 */
	public static int leftFrontDriveMotor = 1;
	public static int leftRearDriveMotor = 2;
	public static int rightFrontDriveMotor = 3;
	public static int rightRearDriveMotor = 4;
	public static int driveHighSpeed = 0;
	public static int driveHighTorque = 1;
	public static int gyroInput = 0;
	
	
	
	
	/* 
	 * Define motors for ball manipulation here
	 * CANBUS values
	 */
	public static int shooterMotor = 5;
	public static int intakeMotor = 6;
	public static int ballManageMotor = 7;
	
	/*
	 * Assign the joystick button names to more meaningful names
	 * used to make code easier to understand in OI class
	 */
	
	/*
	 * Operator buttons
	 */
	public static int shootBlindButton = logitechControllerXbutton;
	public static int intakeButton = logitechControllerYbutton;
	
	/*
	 * Driver buttons
	 */
	public static int driveTorqueButton = logitechControllerLStickButton;
	public static int driveSpeedButton = logitechControllerRStickButton;
	
	/*
	 * Set all static motor speed values here
	 */
	public static double constantShooterSpeed = 1 ;
	public static double constantIntakeSpeed = .5 ;
	
	
	
	
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
