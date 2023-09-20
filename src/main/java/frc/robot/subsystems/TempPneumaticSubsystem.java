package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TempPneumaticSubsystem extends SubsystemBase 
{

    public Solenoid solenoid;
    public Compressor compressor;

    public TempPneumaticSubsystem() {
        solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
        compressor = new Compressor(PneumaticsModuleType.CTREPCM);

        //so it doesnt actually explode
        compressor.enableDigital();
        
    } 
    

}
