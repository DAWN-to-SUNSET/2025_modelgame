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
    intakeMotor.set(intakePower);
  }

  public void stop() {
    intakeMotor.set(0);;
  }
  
}
