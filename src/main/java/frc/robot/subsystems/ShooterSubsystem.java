package frc.robot.subsystems;

import java.util.ArrayList;
import java.util.Arrays;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase 
{
    private TalonFX m_motor;
    // private PWM servoA; 

    // private PWM servoB;
    public ShooterSubsystem() {
        this.m_motor = new TalonFX(Constants.shooterID);
        // servoA = new PWM( Constants.servoA);
        // servoB = new PWM( Constants.servoB);

        
    }
    public void SetPower(double power)
    {
        
        this.m_motor.set(ControlMode.PercentOutput, power);
    }
    /**
     * 
     * @param angle From 0 to 270 degrees
     */
    // public void SetAngle(int angle)
    // {
    //     int setpoint = (angle/270) * 255;
    //     //:Min: 500μs
    //     //:Mid: 1500μs
    //     //:Max: 2500μs
    //     for (PWM servo : Arrays.asList(servoA, servoB)) 
    //     {
    //         System.out.println(servo.getRawBounds().min);
    //         System.out.println(servo.getRawBounds().max);
    //     }
        
        


    // }
    @Override
    public void periodic() {
        // for (PWM servo : Arrays.asList(servoA, servoB)) 
        // {
        //     System.out.println("min of servo" +   servo.getRawBounds().min);
        //     System.out.println("max of servo" +   servo.getRawBounds().max);
        // }
    }
}
