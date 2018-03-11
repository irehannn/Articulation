package org.usfirst.frc.team687.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public Talon rightMaster;
	public Talon leftMaster;
	public Talon rightSlave1;
	public Talon leftSlave1;
	public Talon rightSlave2;
	public Talon leftSlave2;
public Drive() {
	rightMaster = new Talon(0);
	leftMaster = new Talon(1);
	rightSlave1 = new Talon(2);
	leftSlave1= new Talon(3);
	rightSlave2 = new Talon(4);
	leftSlave2 = new Talon(5);
}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive (double leftPower, double rightPower) {
    	rightMaster.set(rightPower);
    	leftMaster.set(leftPower);
    	rightSlave1.set(rightPower);
    	leftSlave1.set(leftPower);
    	rightSlave2.set(rightPower);
    	leftSlave2.set(leftPower);
    }
}
    

