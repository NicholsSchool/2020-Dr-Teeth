/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final double LEFT_MASTER_F = 0.2;
    public static final double LEFT_MASTER_P = 0.2;
    public static final double LEFT_MASTER_I = 0.0;
    public static final double LEFT_MASTER_D = 0.0;

    public static final double RIGHT_MASTER_F = 0.2;
    public static final double RIGHT_MASTER_P = 0.2;
    public static final double RIGHT_MASTER_I = 0.0;
    public static final double RIGHT_MASTER_D = 0.0;

    public static final boolean BACK_OMNIS_ENGAGED = true;
    public static final boolean BACK_OMNIS_DISENGAGED = !BACK_OMNIS_ENGAGED;

    public static final double RAMP_TIME = 0.05;

    public static final double DRIVE_TRAIN_EQUALIZIER = 0.95;

    public static final int CONFIG_TIMEOUT = 100;

    public static final double QUEUE_MOVE_SPEED = 0.6;
    public static final double QUEUE_UNLOAD_SPEED = 0.6;
    public static final double QUEUE_DELAY_TIME = 0.0;
    public static final double QUEUER_AGITATE_SPEED = -0.5;
    public static final double QUEUER_REVERSE_AGITATE_TIME = 0.1;
    public static final double QUEUER_AGITATE_TIME = 0.05;
    public static final double TIMED_SHOOT_GAP = 1.5;

    public static final double FEEDER_FEED_SPEED = 0.5;
    public static final double FEEDER_SPIT_OUT_SPEED = -0.5;

    public static final double DART_SPEED = 0.5;
    public static final double DART_RAMP_TIME = 0.5;

    public static final double INTAKE_SPEED = 1;

    public static final double SHOOTER_F = 0.057; // 0.055
    public static final double SHOOTER_P = 0.14; //0.14
    public static final double SHOOTER_I = 0;
    public static final double SHOOTER_D = 0;
    public static final double SHOOTER_RAMP_TIME = 1;
    public static final double SHOOTER_MAX_VELOCITY = 21000;
    public static final double SHOOT_VELOCITY = 0.8 * SHOOTER_MAX_VELOCITY;
    public static final double SHOOTER_VELOCITY_THRESHOLD = 200;
    public static final double SHOOTER_REVERSE_SPEED = -0.5;
    public static final double SHOOT_TIMEOUT = 3;

    public static final double CWS_SPINNER_SPEED = 0.25;
	public static final int LENGTH = 0;
	public static final int HEIGHT = 0;
    public static final int FRAMES_PER_SECOND = 0;

    //Camera

    public static final int CAMERA_WIDTH = 320;
    public static final int CAMERA_HEIGHT = 240;
    public static final int FRAME_RATE = 30;

    private static final String MEGALOVANIA_FILE = "megalovania.chrp";
    private static final String ANTHEM_FILE = "anthem.chrp";
    public static final String MUSIC_FILE = ANTHEM_FILE;


    //Double check these values
    public static final boolean BREAK_SWITCH_ENGAGE = true;
    public static final boolean BREAK_SWITCH_DISENGAGE = !BREAK_SWITCH_ENGAGE;
    public static final boolean CLIMBER_EXTEND = true;
    public static final boolean CLIMBER_LOCK_EXTENDER = !CLIMBER_EXTEND;


    public static final double DRIVE_FAST_MODE = 1.0;
    public static final double DRIVE_SLOW_MODE = 0.5;

    public static final double METERS_PER_INCH = 0.023;
    public static final double DRIVE_TICKS_PER_REV = 4096;
    public static final double DRIVE_WHEEL_DIAMETER = 4.0; // inches
    public static final double INCHES_PER_TICK = Math.PI * DRIVE_WHEEL_DIAMETER / DRIVE_TICKS_PER_REV;
    public static final double METERS_PER_TICK = INCHES_PER_TICK * METERS_PER_INCH;

    public static final double AUTO_TURN_TOLERANCE = 5;
    public static final double AUTO_DRIVE_TOLERANCE = 3 / INCHES_PER_TICK;

    public static final double VISION_THETA_TOLERANCE = 1.0;
    public static final double DRIVE_TRAIN_TURN_kF = 0.35;
    public static final double DRIVE_TRAIN_DRIVE_kF = 0.25;
    public static final double SHOOTER_X_OFFSET = -8.0;
    public static final double SHOOTER_Y_OFFSET = 0.0;
    public static final double SHOOTER_Z_OFFSET = 9.0;

    public static final double DART_kF = 0.07;
    public static final int DART_MIN_POSITION = 270;
    public static final int DART_MAX_POSITION = 360;
	public static final long STREAM_FRAME_TIME_MS = 69;
}
