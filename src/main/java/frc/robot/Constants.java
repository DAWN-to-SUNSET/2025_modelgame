// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.config.SparkMaxConfig;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class motornumber {
    public static final int kRightFrontWheelID = 1;
    public static final int kRightRearWheelID = 2;
    public static final int kLeftFrontWheelID = 3;
    public static final int kLeftRearWheelID = 4;

    public static final int kIntakeMotorID = 5;
    public static final int kTransferMotorID = 6;
    public static final int kDirectionMotorID = 7;
    public static final int kAngleMotorID = 8;
    public static final int kShooterLowerMotorID = 9;
    public static final int kshooterUpperMotorID = 10;
  }
  
  public static final class DriveConstants {
    public static final double kspeed = 0.7; // undone
  }

  public static final class SparkConfig{
    public static  SparkMaxConfig getConfig(){
      SparkMaxConfig config = new SparkMaxConfig();
      
      config.closedLoop.pid(0, 0, 0);

      config.softLimit.forwardSoftLimit(4.5);
      config.softLimit.reverseSoftLimit(4.5);
      
      return config;
    }
  }

}
