package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.OI;
import org.usfirst.frc.team2854.robot.commands.SensorDriveTest;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class SensorDrive extends PIDSubsystem {

	private Encoder driveEncoder = new Encoder(OI.Encoder.SetA.A, OI.Encoder.SetA.B);
    // Initialize your subsystem here
    public SensorDrive() {
    	super(0.001, 0.001, 0);
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    	enable();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SensorDriveTest());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
    public double getRaw() {
    	return driveEncoder.getRaw();
	}
}
