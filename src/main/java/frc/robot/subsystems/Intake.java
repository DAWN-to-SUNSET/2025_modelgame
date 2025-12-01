package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;

public class Intake extends SubsystemBase{
  
  private SparkMax intakeMotor;

  public Intake() {
    intakeMotor = new SparkMax(motornumber.kIntakeMotorID, MotorType.kBrushed);
  }
  
}
