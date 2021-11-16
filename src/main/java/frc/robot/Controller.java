// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import static edu.wpi.first.wpilibj.GenericHID.Hand.*;

/** Add your docs here. */
public class Controller
{
    public static class Drive
    {
        private static XboxController controller = new XboxController(0);

        public static double get_forward()
        {
            return controller.getY(kLeft);
        }

        public static double get_turn()
        {
            return controller.getX(kLeft);
        }
    }
}
