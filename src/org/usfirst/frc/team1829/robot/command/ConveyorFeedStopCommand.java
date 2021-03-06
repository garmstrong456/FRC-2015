package org.usfirst.frc.team1829.robot.command;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Stops the conveyor motor if it's in motion.
 * @author Nick Mosher, Team 1829 Carbonauts Captain
 */
public class ConveyorFeedStopCommand extends Command
{
	/**
	 * Default constructor
	 */
	public ConveyorFeedStopCommand()
	{
		super("ConveyorFeedStopCommand");
		requires(Robot.getConveyor());
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
