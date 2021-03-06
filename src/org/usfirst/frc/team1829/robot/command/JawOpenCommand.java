package org.usfirst.frc.team1829.robot.command;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Opens the Jaw.  Use to set down a CONTAINER or to set up
 * for picking up a new CONTAINER.
 * @author Nick Mosher, Team 1829 Carbonauts Captain
 */
public class JawOpenCommand extends Command
{
	/**
	 * Default constructor
	 */
	public JawOpenCommand()
	{
		super("JawOpenCommand");
		requires(Robot.getJaw());
	}
	
	/**
	 * Constructor with timeout.
	 * @param duration The time (in seconds) before this command "times out".
	 */
	public JawOpenCommand(double duration)
	{
		super("JawOpenCommand", duration);
		requires(Robot.getJaw());
	}
	
	@Override
	protected void initialize() 
	{
		
	}

	@Override
	protected void execute() 
	{
		
	}

	@Override
	protected boolean isFinished() 
	{
		return false;
	}

	@Override
	protected void end() 
	{
		
	}

	@Override
	protected void interrupted() 
	{
		
	}
}
