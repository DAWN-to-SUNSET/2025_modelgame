package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;
import frc.robot.TankDriveModule;

public class TankDrive extends SubsystemBase {

    private TankDriveModule rightWheel;
    private TankDriveModule leftWheel;

    public TankDrive(int kRightFrontWheelID, int kRightRearWheelID, int kLeftFrontWheelID, int kLeftRearWheelID) {
        rightWheel = new TankDriveModule(kRightFrontWheelID, kRightRearWheelID);
        leftWheel = new TankDriveModule(kLeftFrontWheelID, kLeftRearWheelID);   
        
    }

    public void drive(double x, double y) {
        double left_power = (-x + y)* DriveConstants.kspeed;
        double right_power = (-x - y) * DriveConstants.kspeed;

        // bounding
        if (left_power > 1) left_power = 1;
        else if (left_power < -1) left_power = -1;
        if (right_power > 1) right_power = 1;
        else if (right_power < -1) right_power = -1;
        
        rightWheel.setPower(right_power);
        leftWheel.setPower(left_power);
    }

}

//youxiqwtui@gmail.com
//DAWN-to-SUNSET


//SHA256:bxej2kykD8fNkysLbyq+Cs3okcppcHaGfxMKRCUkaXM youxiqwtui@gmail.com


/*
 * ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDHZcepEVG9pO+JinQzar1zOr7rK7WZ/N6clXItF17QeWzalw+Bm
 * hMWgIfZWH/jyn4T2fIgyg3NfptsBadweln39r7qwKiqOQWlWTNye3wXmRqt4zhf+wGfuuXMDWGO2mhPhGFFUfEezAyOtomEi
 * wuV6Pu0kc6NMzgOA0K10vclanAo1l/xsjGSn15iQ9tZ+Aad5iMvpprpaM50AfnBcVotmVzfI5aUu4RWLrXPxtBh2vd4cTtwwAMcf
 * rT46Pjg6AMU8Ju1NXqZtYb1Is7Ay2LbqjNFkFmUXQUy6PKGU9yf6ODAsyk8S0d2jVAAhHCawKXprt9VTV/kzZBO6BVhs4JryIN0Fqk
 * ALcAicMriWdzDRefYopmtDx3PwuCtxhE28Bp7IK3dXwUm6a5TS324yxW/JIx3JeIeM+5sn8HbH8L76c0r7Ld9M/o215IBCdRSkpk8qUSG
 * q15D5bGSLwKN1nw2Mro1Tvyl0352tmSdPhsFuIGSDIJUL5fVqA2rVZ38vhwpJ27XCc8C/fxXtcxKWDanVKO0HUlLh7BLo2H
 * TE3qQPx0A8e72xTFzbFEfOWPj+/dAjoK8ZA/peqtmZybj4YbjGiM/uBudiUw3KV7r7QFkrB
 * fMjIy/PwZiiV8X9kLlYFGZA3xwdBV7STUxkczYizOdmpm7Eu58q8gflC9dqBrG+Q== youxiqwtui@gmail.com
 * 
 * 
 * 
 */