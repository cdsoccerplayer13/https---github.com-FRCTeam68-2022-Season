// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /**
     * The left-to-right distance between the drivetrain wheels
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_TRACKWIDTH_METERS = 20.5; // FIXME Measure and set trackwidth
    /**
     * The front-to-back distance between the drivetrain wheels.
     *
     * Should be measured from center to center.
     */
    public static final double DRIVETRAIN_WHEELBASE_METERS = 26.5; // FIXME Measure and set wheelbase

    //public static final int DRIVETRAIN_PIGEON_ID = 0; // FIXME Set Pigeon ID

    public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 3; // FIXME Set front left module drive motor ID
    public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 4; // FIXME Set front left module steer motor ID
    public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 11; // FIXME Set front left steer encoder ID
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(185.0378+20); // FIXME Measure and set front left steer offset

    public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 7; // FIXME Set front right drive motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 8; // FIXME Set front right steer motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 13; // FIXME Set front right steer encoder ID
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(357.275-30.0); // FIXME Measure and set front right steer offset

    public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 1; // FIXME Set back left drive motor ID
    public static final int BACK_LEFT_MODULE_STEER_MOTOR = 2; // FIXME Set back left steer motor ID
    public static final int BACK_LEFT_MODULE_STEER_ENCODER = 10; // FIXME Set back left steer encoder ID
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(352.166-120.0); // FIXME Measure and set back left steer offset

    public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 5; // FIXME Set back right drive motor ID
    public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 6; // FIXME Set back right steer motor ID
    public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 12; // FIXME Set back right steer encoder ID
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(350.0-13.0); // FIXME Measure and set back right steer offset


    //Shooter Constants Below Here

    //Endgame Constants Below Here

    //Intake Constnats Below Here

    //Controller Constants Below Here
    public static final int CONTROLLOR_DRIVE = 0;
    public static final int CONTROLLOR_MANIP = 1;
    public static final int CONTROLLOR_DRIVE_A = 1;
    public static final int CONTROLLOR_DRIVE_B = 2;
    public static final int CONTROLLOR_DRIVE_X = 3;
    public static final int CONTROLLOR_DRIVE_Y = 4;
    public static final int CONTROLLOR_DRIVE_RB = 5;
    public static final int CONTROLLOR_DRIVE_LB = 6;
    public static final int CONTROLLOR_DRIVE_SELECT = 7;
    public static final int CONTROLLOR_DRIVE_START = 8;
    public static final int CONTROLLOR_DRIVE_LS = 9;
    public static final int CONTROLLOR_DRIVE_RS = 10;
    public static final int CONTROLLOR_MANIP_SQUARE = 1;
    public static final int CONTROLLOR_MANIP_X = 2;
    public static final int CONTROLLOR_MANIP_CIRCLE = 3;
    public static final int CONTROLLOR_MANIP_TRIANGLE = 4;
    public static final int CONTROLLOR_MANIP_LB = 5;
    public static final int CONTROLLOR_MANIP_RB = 6;
    public static final int CONTROLLOR_MANIP_LT = 7;
    public static final int CONTROLLOR_MANIP_RT = 8;
    public static final int CONTROLLOR_MANIP_SELECT = 9;
    public static final int CONTROLLOR_MANIP_START = 10;
    public static final int CONTROLLOR_MANIP_LS = 11;
    public static final int CONTROLLOR_MANIP_RS = 12;
    public static final int CONTROLLOR_MANIP_PS = 13;
    public static final int CONTROLLOR_MANIP_PAD = 14;
}
