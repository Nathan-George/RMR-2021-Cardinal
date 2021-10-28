// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private WPI_VictorSPX frontLeft;
  private WPI_VictorSPX backLeft;

  private WPI_VictorSPX frontRight;
  private WPI_VictorSPX backRight;

  private SpeedControllerGroup left;
  private SpeedControllerGroup right;

  private DifferentialDrive drive;

  /** Creates a new DriveTrain. */
  public DriveTrain()
  {
    // setup left drive
    frontLeft = new WPI_VictorSPX(Constants.Drives.FRONT_LEFT);
    backLeft = new WPI_VictorSPX(Constants.Drives.BACK_LEFT);

    // must be inverted
    backLeft.setInverted(true);

    left = new SpeedControllerGroup(frontLeft, backLeft);

    // setup right drive
    frontRight = new WPI_VictorSPX(Constants.Drives.FRONT_RIGHT);
    backRight = new WPI_VictorSPX(Constants.Drives.BACK_RIGHT);

    right = new SpeedControllerGroup(frontRight, backRight);

    drive = new DifferentialDrive(left, right);
  }

  public void set(float speed, float rotation)
  {
    drive.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
