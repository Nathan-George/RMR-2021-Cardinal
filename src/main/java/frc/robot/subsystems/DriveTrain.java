// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonFX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private SpeedController frontLeft = new PWMTalonFX(Constants.DriveTrainPWMPorts.FRONT_LEFT);
  private SpeedController backLeft = new PWMTalonFX(Constants.DriveTrainPWMPorts.BACK_LEFT);
  private SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, backLeft);

  private SpeedController frontRight = new PWMTalonFX(Constants.DriveTrainPWMPorts.FRONT_RIGHT);
  private SpeedController backRight = new PWMTalonFX(Constants.DriveTrainPWMPorts.BACK_RIGHT);
  private SpeedControllerGroup right = new SpeedControllerGroup(frontRight, backRight);

  private DifferentialDrive main = new DifferentialDrive(left, right);

  /** Creates a new DriveTrain. */
  public DriveTrain() {}

  public void set(double speed, double rotation)
  {
    main.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
