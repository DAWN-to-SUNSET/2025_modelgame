// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

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
    public static final int kShooterLowerMotorID = 9;
    public static final int kshooterUpperMotorID = 8;
  }
  
  public static final class DriveConstants {
    public static final double kspeed = 0.7; 
  }

  public static final class SparkConfig{
    public static  SparkMaxConfig Config(boolean inverted){
      SparkMaxConfig config = new SparkMaxConfig();
      
      config.idleMode(IdleMode.kBrake).inverted(inverted);
      /*              不動的時候外力可使馬達轉動 -> kCoast
                      不動的時候外力無法使馬達轉動(強制固定) -> kBrake
                      iverted -> 是否反轉
      */
      return config;
    }
  }
}
