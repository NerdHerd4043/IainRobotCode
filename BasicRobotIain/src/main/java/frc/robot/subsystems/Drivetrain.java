/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drivetrain extends SubsystemBase {
  private DifferentialDrive diffDrive;

  private CANSparkMax frontLeftMotor = new CANSparkMax(DriveConstants.frontLeftMotorID, MotorType.kBrushless);
  private CANSparkMax frontRightMotor = new CANSparkMax(DriveConstants.frontRightMotorID, MotorType.kBrushless);
  private CANSparkMax backLeftMotor = new CANSparkMax(DriveConstants.backLeftMotorID, MotorType.kBrushless);
  private CANSparkMax backRightMotor = new CANSparkMax(DriveConstants.backRightMotorID, MotorType.kBrushless);

  private Solonoid shifter = new Solonoid(RobotConstants.PCMID);

  /**
   * Creates a new Drivetrain.
   */
  public Drivetrain() {
    restoreFactoryDefaults();
    setDriveTrainIdleMode(IdleMode.kBrake);
    shifter.set(false);

    backLeftMotor.follow(frontLeftMotor);
    backRightMotor.follow(frontRightMotor);

    diffDrive = new DifferentialDrive(frontLeftMotor, frontRightMotor);
  }



/**
 * Restores the Factory Defaults for the drive motors
 */
  private void restoreFactoryDefaults {
    backLeftMotor.restoreFactoryDefaults();
    backRightMotor.restoreFactoryDefaults();
    frontLeftMotor.restoreFactoryDefaults();
    frontRightMotor.restoreFactoryDefaults();

  }
/**
 * Sets the idle mode setting for the entire drivetrain
 * @param mode idle mode (coast or brake)
 */
  private void setDriveTrainIdleMode(IdleMode mode){
    backLeftMotor.setIdleMode(mode);
    backRightMotor.setIdleMode(mode);
    frontLeftMotor.setIdleMode(mode);
    frontRightMotor.setIdleMode(mode);
  }
/**
 * 
 * @param fwd the command forward movement
 * @param rot the command rotation
 */
  public void arcadeDrive(double fwd, double rot){
    diffDrive.arcadeDrive(fwd, rot, true);

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
