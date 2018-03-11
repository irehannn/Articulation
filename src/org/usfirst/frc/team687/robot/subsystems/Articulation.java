package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.Robot;
import org.usfirst.frc.team687.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Articulation extends Subsystem {
	public Talon m_articMaster;
	public Talon m_articSlave;
	public Articulation() {
	m_articMaster = new Talon(RobotMap.kArticMasterPort);
	m_articSlave = new Talon(RobotMap.kArticSlavePort);
}
public void setPower(double power) {
	m_articMaster.set(power);
	m_articSlave.set(power);
}
public void moveUp() {
	m_articMaster.set(1);
	m_articSlave.set(1);
}
public void moveDown() {
	m_articMaster.set(-1);
	m_articSlave.set(-1);
}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

