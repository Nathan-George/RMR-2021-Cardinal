// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PDPMoniter extends SubsystemBase {
  private PowerDistributionPanel PDP;

  /** Creates a new PDPMoniter. */
  public PDPMoniter() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    int[] channels = {0, 1, 2, 3, 12, 13, 14, 15};
    for (int channel : channels) {
      SmartDashboard.putNumber("Current ${channel}", PDP.getCurrent(channel));
    }
  }
}
