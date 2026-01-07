package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motornumber;

public class Transfer extends SubsystemBase {
  private WPI_VictorSPX transferMotor;
  private double transferPower;

  public Transfer() {
    transferMotor = new WPI_VictorSPX(motornumber.kTransferMotorID);
    transferMotor.setNeutralMode(NeutralMode.Coast);
    transferPower = 0.7; 
  }

  public void transferring() {
    transferMotor.setVoltage(transferPower*11.0);
  }

  public void stop() {
    transferMotor.set(0);
  }
}
