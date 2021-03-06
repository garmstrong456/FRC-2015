package org.usfirst.frc.team1829.robot.command;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Command to test the subsystem, such as taking sensor
 * readings or calibrating PID.
 * @author Nick Mosher, Team 1829 Carbonauts Captain
 */
public class DriveDiagnosticCommand extends Command
{
	private Drive drive;
	private boolean finished;
	
	/**
	 * Default constructor.
	 */
	public DriveDiagnosticCommand()
	{
		super("DriveDiagnosticCommand");
		requires(drive = Robot.getDrive());
	}

	@Override
	protected void initialize() 
	{
		System.out.println(getName() + " initialized!");
		finished = false;
	}

	@Override
	protected void execute() 
	{
		System.out.println(drive.getFeedback());
	}

	@Override
	protected boolean isFinished() 
	{	
		return finished;
	}

	@Override
	protected void end() 
	{
		System.out.println(getName() + " ended!");
	}

	@Override
	protected void interrupted() 
	{
		System.out.println(getName() + " interrupted!");
	}
}