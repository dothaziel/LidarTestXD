package frc.robot;
import frc.robot.commands.StartStop;
import frc.robot.gamepad.OI;
import frc.robot.subsystems.LidarTest;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static LidarTest lidar;
  public static OI oi;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    lidar = new LidarTest();
    oi = new OI();
    lidar.setDefaultCommand(new StartStop());
  }
}
