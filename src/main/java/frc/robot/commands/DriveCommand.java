// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Controller;
import frc.robot.subsystems.DriveTrain;

public class DriveCommand extends CommandBase {
  private DriveTrain driveTrainSubsystem;

  /** Creates a new Drive. */
  public DriveCommand(DriveTrain in_driveTrainSubsystem) {
    driveTrainSubsystem = in_driveTrainSubsystem;
    
    addRequirements(driveTrainSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrainSubsystem.set(Controller.Drive.get_forward(), Controller.Drive.get_turn());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
