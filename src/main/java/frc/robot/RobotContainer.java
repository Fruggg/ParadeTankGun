// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import javax.swing.plaf.synth.Region;

import org.ejml.equation.Variable;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ShootCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.TempPneumaticSubsystem;
import frc.robot.utils3603.EZButton;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {
  
  public Joystick driver = EZButton.GetPort0();
  //#region Controls
  //Held to open, will close when not held
  JoystickButton d_solenoid = EZButton.NewDriver(Button.kX);
   
  //#endregion
  
  //#region subsystems
  private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
  private final TempPneumaticSubsystem pneumaticSubsystem = new TempPneumaticSubsystem();

  //#endregion
  //#region commands

  private final ShootCommand shootCommand = new ShootCommand(shooterSubsystem, () -> -driver.getRawAxis(XboxController.Axis.kRightTrigger.value));

 
  //#endregion

  

  public RobotContainer() {

    m_driveSubsystem.setDefaultCommand
      (
        new DriveCommand(m_driveSubsystem, 
        () -> driver.getRawAxis(XboxController.Axis.kLeftY.value), 
        () -> -driver.getRawAxis(XboxController.Axis.kRightX.value))
      );

    shooterSubsystem.setDefaultCommand(shootCommand);

    //Solenoid is active when the button is pressed
    //Inverted because wpilib can go to hell
    //god im rusty
    pneumaticSubsystem.solenoid.set(!d_solenoid.getAsBoolean());
  }

  public Command getAutonomousCommand() {
    return new WaitCommand(1);
  }
}
