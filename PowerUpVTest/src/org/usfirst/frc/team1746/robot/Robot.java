/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1746.robot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Controls m_controls;
    DriveTrain m_driveTrain;
    String m_commandsToDoDuringAutonomous="";
    Pattern m_pattern;
    Matcher m_matcher;
    
	@Override
	public void robotInit() {
		m_controls = new Controls();
	 	m_driveTrain = new DriveTrain(m_controls);
	 	m_driveTrain.resetGyro();
	 	
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override
	public void autonomousInit() {
		AutonConstants autonConstants = new AutonConstants();
		m_pattern = Pattern.compile("([A-Z])([^A-Z]*)");
		int[] commandsToDo = { 1, 8 };
		int from=-1;
		for(int to: commandsToDo) {
			if (from>0) {
				m_commandsToDoDuringAutonomous=m_commandsToDoDuringAutonomous+autonConstants.commands[from-1][to-4];
			}
			from=to;
		}
		m_matcher = m_pattern.matcher(m_commandsToDoDuringAutonomous);
		m_matcher.find();
	}
	
	@Override
	public void autonomousPeriodic() {
		boolean m_commandComplete;
		switch(m_matcher.group(1)){
		case "A":
			m_commandcomplete = 
		break;	
		}
	}

	/**
	 * This function is called once each time the robot enters teleoperated mode.
	 */
	@Override
	public void teleopInit() {
		m_driveTrain.resetEncoders();
		m_driveTrain.setRampRate(0);
		m_driveTrain.setBrakeMode(false);
	}

	/**
	 * This function is called periodically during teleoperated mode.
	 */
	@Override
	public void teleopPeriodic() {
		m_driveTrain.teleopArcadeDrive();
		updateSmartDashboard();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
	
	public void updateSmartDashboard() {
		m_driveTrain.updateSmartDashboard();
		
	}
}
