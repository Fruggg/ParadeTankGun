package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class PrayForForgiveness extends CommandBase
{
    private ShooterSubsystem m_shooter;
    private DriveSubsystem m_drive;

    public PrayForForgiveness() {
        super();
    }
    @Override
    public void execute() {
        //generate random number
        double rando;
        //use the number to determine total time turning

        //turn for seconds

        //wait, fire, then wait again for annoymous laoder
    }
}
