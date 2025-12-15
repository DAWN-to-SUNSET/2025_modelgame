package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;

public class Transfer extends SubsystemBase {
  private WPI_VictorSPX transferMotor;
  private double transferPower;

  public Transfer() {
    transferMotor = new WPI_VictorSPX(motornumber.kTransferMotorID);
    transferPower = 0.7; 
  }

  public void transferring() {
    transferMotor.set(transferPower);
  }

  public void stop() {
    transferMotor.set(0);
  }
}
