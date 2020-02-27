/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.sensors;

import com.revrobotics.Rev2mDistanceSensor;
import com.revrobotics.Rev2mDistanceSensor.Port;
import com.revrobotics.Rev2mDistanceSensor.Unit;
import com.revrobotics.Rev2mDistanceSensor.RangeProfile;

import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class DistanceSensor {

    private Rev2mDistanceSensor distanceSensor;
    public DistanceSensor()
    {
        distanceSensor = new Rev2mDistanceSensor(Port.kOnboard, Unit.kMillimeters, RangeProfile.kHighAccuracy);
        distanceSensor.setAutomaticMode(true);
    } 

    public double getDistance()
    {
        //This if is a test to avoid getting -1
        if(!isRangeValid()) {
        }
        return distanceSensor.getRange();
    }

    public boolean isRangeValid()
    {
        return distanceSensor.isRangeValid();
    }
}