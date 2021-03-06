/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class SpinCWS extends CommandBase {
    /**
     * Creates a new CWS.
     */
    public SpinCWS() {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(RobotContainer.spinner);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    /**
     * starts the spinner
     */
    @Override
    public void execute() {
        RobotContainer.spinner.spin();
    }

    /**
     * calls stop method to stop spinner.
     */
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        RobotContainer.spinner.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
