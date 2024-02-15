// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Constants.DrivetrainConstants;
import frc.robot.subsystems.DrivetrainSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class testDrive extends PIDCommand {
  /** Creates a new testDrive. */
  public testDrive(DrivetrainSubsystem drive) {
    super(
        // The controller that the command will use
        new PIDController(DrivetrainConstants.P, 0.1, 0.15),
        // This should return the measurement
        () -> drive.getLeftDistance(),
        // This should return the setpoint (can also be a constant)
        () -> 3,
        // This uses the output
        output -> {
          drive.tankDrive(() -> output, () -> output);
        });

        addRequirements(drive);

        getController().setTolerance(0.1);
    // Use addRequirements() here to declare subsystem dependencies.
    // Configure additional PID options by calling `getController` here.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {

    // getController().setTolerance(0.1);
    if(getController().atSetpoint()){
      return true;
    }
    return false;
  }
}