package frc.robot.commands;

import java.util.Random;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class PrayForForgiveness extends SequentialCommandGroup
{
    private ShooterSubsystem m_shooter;
    private DriveSubsystem m_drive;

    public PrayForForgiveness() {
        
        addCommands
        (

        );
    }
    // @Override
    // public void execute() {
    //     //generate random number
    //     double rando = new Random().nextDouble(0, 4);
    //     //use the number to determine total time turning

    //     //turn for seconds

    //     //wait, fire, then wait again for annoymous laoder
    // }
}
