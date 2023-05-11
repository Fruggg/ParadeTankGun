// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ShootCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {
  public Joystick driver = new Joystick(0);

  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

  private final ShootCommand shootCommand = new ShootCommand(shooterSubsystem, () -> driver.getRawAxis(XboxController.Axis.kRightTrigger.value));

 
  public RobotContainer() {
    
  
    m_driveSubsystem.setDefaultCommand
      (
        new DriveCommand(m_driveSubsystem, 
        () -> driver.getRawAxis(XboxController.Axis.kLeftY.value), 
        () -> driver.getRawAxis(XboxController.Axis.kRightX.value))
      );
    shooterSubsystem.setDefaultCommand(shootCommand);

  }

  public Command getAutonomousCommand() {
    return new WaitCommand(1);
  }
}
