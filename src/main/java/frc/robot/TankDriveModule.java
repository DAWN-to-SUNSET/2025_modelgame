package frc.robot;

import com.ctre.phoenix6.signals.BrushedMotorWiringValue;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class TankDriveModule {
    private SparkMax frontMotor;
    private SparkMax rearMotor;

    public TankDriveModule(int kFrontMotorID, int kRearMotorID){
        frontMotor = new SparkMax(kFrontMotorID, MotorType.kBrushed);
        rearMotor = new SparkMax(kRearMotorID, MotorType.kBrushed);
    }

    public void setPower(double power) {
        frontMotor.set(power);
        rearMotor.set(power);
    }
}

