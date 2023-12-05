package frc.robot.subsystems.intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.ArmConstants;

public class Claw extends SubsystemBase {
    private final CANSparkMax intakeMotor;


    public Claw() {
        // rotate motor
        intakeMotor = new CANSparkMax(ArmConstants.kIntakeMotorPort, MotorType.kBrushless);
        intakeMotor.restoreFactoryDefaults();
        intakeMotor.setIdleMode(IdleMode.kCoast);

    }

    public void runIntake(boolean inverted) {
        intakeMotor.set((inverted ? -1 : 1) * Constants.ArmConstants.kClawIntakeSpeed);
    }

    public void stopIntake() {
        intakeMotor.stopMotor();
    }
}
