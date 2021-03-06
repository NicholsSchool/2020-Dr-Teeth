/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;

public class ColorWheelSpinner extends SubsystemBase {
    private WPI_TalonSRX cWSMotor;

    /**
     * Creates a new ColorWheelSpinner.
     */
    public ColorWheelSpinner() {
        cWSMotor = new WPI_TalonSRX(RobotMap.CWS_MOTOR_ID);
        cWSMotor.configFactoryDefault();
    }

    /**
     * sets speed to be used to spin the CWS.
     * 
     * @param speed - speed of spinner
     */
    public void move(double speed) {
        cWSMotor.set(speed);

    }

    /**
     * spins the Color Wheel Spinner.
     */
    public void spin() {
        move(Constants.CWS_SPINNER_SPEED);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run.
    }

    /**
     * Stops color wheel spinner
     */
    public void stop() {
        cWSMotor.stopMotor();
    }
}
