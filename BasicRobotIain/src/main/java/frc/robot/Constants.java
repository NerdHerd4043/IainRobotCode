/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class DriveConstants{
        
        public static final int backLeftMotorID = 1;
        public static final int frontLeftMotorID = 2;
        public static final int frontRightMotorID = 3;
        public static final int backRightMotorID = 4;

        public static final int shifterID = 1;

        public static final boolean shiftUpID = false;
        public static final boolean shiftDownID = true;
    }

    public class RobotConstants{

        public static final int PCMID = 1;
    }

    public class HopperConstants{

        public static final int conveyorMotorID = 5;
        public static final int kickupMotorID = 6;
        public static final int flywheelMotorID = 7;

        public static final int doorID = 2;

        public static final double conveyorSpeed = 0.5;
        public static final double kickupSpeed = 0.5;
    }
}
