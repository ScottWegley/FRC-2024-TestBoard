package frc.robot;

import java.util.HashMap;
import java.util.List;

import com.pathplanner.lib.PathPlanner;
import com.pathplanner.lib.PathPlannerTrajectory;
import com.pathplanner.lib.auto.PIDConstants;
import com.pathplanner.lib.auto.SwerveAutoBuilder;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.Constants.ArmConstants;
import frc.robot.Constants.AutoConstants;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.RunSetClaw;
import frc.robot.commands.RunSetFlexAngle;
import frc.robot.commands.RunSetRotateAngle;
import frc.robot.commands.RunToggleClaw;
import frc.robot.commands.RunWristJoystick;
import frc.robot.oi.OI;
import frc.robot.subsystems.intake.Claw;
import frc.robot.subsystems.intake.Wrist;

public class RobotContainer {
    // Subsystems
    private final Wrist wrist = new Wrist();
    private final Claw claw = new Claw();

    // Event map for button binding and autos

    // Choosers

    // Controllers
    private final Joystick primaryJoystick = new Joystick(OIConstants.kPrimaryJoystickID);

    // Secondary controller buttons
    private final JoystickButton secondaryJoystickAButton = new JoystickButton(primaryJoystick, 1); // Square Button

    public RobotContainer() {

        // default commands
        wrist.setDefaultCommand(new RunWristJoystick(primaryJoystick, wrist));
        configButtonBindings();

    }

    private void configButtonBindings() {
        // claw
        secondaryJoystickAButton.onTrue();

    }

    public void updateSmartDashboard() {
        // flex
        SmartDashboard.putNumber("Flex Setpoint", wrist.getFlexSetpoint());
        SmartDashboard.putNumber("Flex Position", wrist.getFlexAngle());

        // claw
        SmartDashboard.putString("Claw State", claw.isOpen() ? "Open" : "Close");
    }
}
