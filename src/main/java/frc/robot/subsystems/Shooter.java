// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;

public class Shooter extends SubsystemBase {
  private SparkMax angleMotor;
  private WPI_VictorSPX lowerMotor;
  private WPI_VictorSPX upperMotor;
  private double shootPower;


  public Shooter() {
    angleMotor = new SparkMax(motornumber.kAngleMotorID, MotorType.kBrushless);
    lowerMotor = new WPI_VictorSPX(motornumber.kShooterLowerMotorID);
    upperMotor = new WPI_VictorSPX(motornumber.kshooterUpperMotorID);

    shootPower = 0.7; //undone
  }

  public void shoot() {
    lowerMotor.set(shootPower);
    upperMotor.set(shootPower);
  }

  public void angleUp() {
    angleMotor.getClosedLoopController().setReference(, ControlType.kPosition);
  }
  
  public void angleDown() {
    angleMotor.set(-anglePower);
  }

  public void angleStop() {
    angleMotor.set(0);
  }

  public void shootStop() {
    lowerMotor.set(0);
    upperMotor.set(0);
  }
}
