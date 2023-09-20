package frc.robot.utils3603;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class EZButton
{
    private static Joystick driver;
    private static Joystick operator;

    public static Joystick GetPort0()
    {
        return driver != null? driver : new Joystick(0);   

    }
    public static Joystick GetPort1()
    {
        return operator != null? operator : new Joystick(1);   
    }
    public static JoystickButton NewDriver(XboxController.Button button)
    {
        //Does this work?
        return new JoystickButton(GetPort0(), button.value);
    }
    public static JoystickButton NewOperator(XboxController.Button button)
    {
        //Does this work?
        return new JoystickButton(GetPort1(), button.value);
    }
}
