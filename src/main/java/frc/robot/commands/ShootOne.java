/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ShootOne extends CommandBase {
    /**
     * Creates a new ShootOne.
     */
    public ShootOne() {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(RobotContainer.shooter);
        addRequirements(RobotContainer.queuer);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        RobotContainer.shooter.shoot();
        if (RobotContainer.shooter.isAtVelocity())
            RobotContainer.queuer.unloadOne();
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        RobotContainer.shooter.stop();
        RobotContainer.queuer.stop();
        // RobotContainer.c0.setRumble(RumbleType.kRightRumble, 1);
        // RobotContainer.c1.setRumble(RumbleType.kRightRumble, 1);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        if (RobotContainer.irSensorOveride)
            return false;
        boolean[] values = RobotContainer.irSystem.getValues();
        return values[values.length - 1];
    }
}
