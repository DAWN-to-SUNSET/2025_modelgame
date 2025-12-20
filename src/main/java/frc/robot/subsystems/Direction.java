// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.motornumber;

public class Direction extends SubsystemBase {
  
  private SparkMax directionMotor;
  private double directionPower;

  public Direction() {
    directionMotor = new SparkMax(motornumber.kDirectionMotorID, MotorType.kBrushless);
  }

  public void turn(double left, double right) {
    left = -left;
    directionPower = (left + right) *DriveConstants.kspeed;

    directionMotor.set(-directionPower);
  }

  public void stop() {
    directionMotor.set(0);
  }

  
}
