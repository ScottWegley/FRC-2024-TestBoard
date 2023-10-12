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

        //flex
        public static final double kFlexLowerBound = -300;
        public static final double kFlexUpperBound = 300;

        public static final double kPFlex = 0.05;
        public static final double kIFlex = 0.0;
        public static final double kDFlex = 0.0;
        public static final double kIZoneFlex = 0.0;
        public static final double kFFFlex = 0.0;

        public static final int kFlexMotorPort = 8;

        //claw 
        public static final int kClawSolenoidPort = 0;
        public static final double kClawIntakeSpeed = 0.5;
        public static final int kIntakeMotorPort = 7;
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

        public static final double kDriverExp = 7.0 / 3; //Exponentiate the joystick values to have finer control at low values

        public static final double kDeadband = 0.01; 
    }
}