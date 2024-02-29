// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.proto.Kinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public class DrivetrainConstants {

    public final static double ks = 0.1812;
    public final static double kv = 1.9351;
    public final static double ka = 0.092433;

    public final static double P = 0.61206;
    final double I = 0;
    final double D = 0;

    public static final double kMaxSpeedMetersPerSecond = 1.5;
    public static final double kMaxAccelerationMetersPerSecondSquared = 2;

    public static final double kRamseteB = 1;
    public static final double kRamseteZeta = 0.7;

    public static final DifferentialDriveKinematics Dkinematics = new DifferentialDriveKinematics(Units.inchesToMeters(24.8)); // distance between left and right wheels in metres

    
  }

  public class ArmConstants{
    public final static double P = 0.03;
    public final static double I = 0;
    public final static double D = 0;

    }

  
}
