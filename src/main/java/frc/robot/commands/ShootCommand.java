package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootCommand extends CommandBase
{
    ShooterSubsystem shooter;
    DoubleSupplier power;
    public ShootCommand(ShooterSubsystem shooter, DoubleSupplier power) {
        this.shooter = shooter;
        this.power = power;
        this.addRequirements(shooter);
    }
    @Override
    public void execute() 
    {
        this.shooter.SetPower(power.getAsDouble());
    }
    @Override
    public boolean isFinished() {
        //!lmao might be unsafe
        return false;
        
    }
}
