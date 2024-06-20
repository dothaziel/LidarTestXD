package frc.robot.subsystems;

import com.studica.frc.Lidar;
import com.studica.frc.Lidar.ScanData;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LidarTest extends SubsystemBase {
    private Lidar lidar;
    private ScanData scanData;
    public boolean scanning = true;

    public LidarTest() {
        lidar = new Lidar(Lidar.Port.kUSB1);
    }

    public void startScan() {
        lidar.start();
        scanning = true;
    }
    public void stopScan() {
        lidar.stop();
        scanning = false;
    }

    @Override
    public void periodic() {
        lidar.start();
        if(scanning) {
            SmartDashboard.putString("Message", "Scanning");
            scanData = lidar.getData(); 
            SmartDashboard.putNumber("Angle", scanData.angle[30]);
            SmartDashboard.putNumber("Distance", scanData.distance[30]);
        }
    }
}