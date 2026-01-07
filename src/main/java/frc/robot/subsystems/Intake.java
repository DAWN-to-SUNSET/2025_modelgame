package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;

public class Intake extends SubsystemBase{
  
  private WPI_VictorSPX intakeMotor;
  private double intakePower;

  public Intake() {
    intakeMotor = new WPI_VictorSPX(motornumber.kIntakeMotorID);
    intakePower = 0.75;  
  }

  public void intaking() {
    intakeMotor.setVoltage(intakePower*11.0); //setVoltage可直接控制輸出電壓，不因為電壓不足而減少輸出的力(相對於set)
  }

  public void stop() {
    intakeMotor.set(0);
  }
  
}
