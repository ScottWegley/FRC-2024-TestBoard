package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.EjectPiece;
import frc.robot.commands.IntakePiece;
import frc.robot.commands.StopIntake;
import frc.robot.subsystems.intake.Claw;

public class RobotContainer {
    // Subsystems
    private final Claw claw = new Claw();


    // Controllers
    private final Joystick primaryJoystick = new Joystick(OIConstants.kPrimaryJoystickID);

    // Secondary controller buttons
    private final JoystickButton primaryJoystickAButton = new JoystickButton(primaryJoystick, 1); // Square Button
    private final JoystickButton primaryJoystickBButton = new JoystickButton(primaryJoystick, 2);

    public RobotContainer() {

        // default commands
        configButtonBindings();

    }

    private void configButtonBindings() {
        // claw
        primaryJoystickAButton.whileTrue(new IntakePiece(claw));
        primaryJoystickBButton.whileTrue(new EjectPiece(claw));
    }
}
