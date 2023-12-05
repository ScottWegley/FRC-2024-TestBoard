package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public class Constants {
    //--------------------------------------------------------------------------------------------
    //      Notes:
    //-If we get new wheels, edit kWheelDiameterMeters
    //--------------------------------------------------------------------------------------------

    //If using the Potentiometer, this specifies its max value so we can get the angle
    public static final double potMax = 3798;

    public static final double neoMaxRPM = 5000; //5000 was experimentally determined from our swerve chassis    
    public static final class ArmConstants {

        //claw 
        public static final double kClawIntakeSpeed = 0.25;
        public static final int kIntakeMotorPort = 13;
    }

    //Checked and verified as of May 1st, 2022
    public static final class OIConstants {
        public static final int kPrimaryJoystickID = 0;
        public static final int kPrimaryJoystickLeftXAxisID = 0;
        public static final int kPrimaryJoystickLeftYAxisID = 1;
        public static final int kPrimaryJoystickLeftTriggerID = 2;
        public static final int kPrimaryJoystickRightTriggerID = 3;
        public static final int kPrimaryJoystickRightXAxisID = 4;
        public static final int kPrimaryJoystickRightYAxisID = 5;

    }
}