// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;
import frc.robot.Constants.SparkConfig;

public class Shooter extends SubsystemBase {
  private WPI_VictorSPX lowerMotor;
  private WPI_VictorSPX upperMotor;
  private double shootPower;


  public Shooter() {
    lowerMotor = new WPI_VictorSPX(motornumber.kShooterLowerMotorID);
    upperMotor = new WPI_VictorSPX(motornumber.kshooterUpperMotorID);

    shootPower = 0.7; 

  }

  public void shoot() {
    lowerMotor.setVoltage(shootPower*11.0); //當電池滿電時為12.多伏特
    upperMotor.setVoltage(shootPower*5.5);
  }

  public void shootStop() {
    lowerMotor.set(0);
    upperMotor.set(0);
  }


}
