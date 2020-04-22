/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.HopperConstants;

public class KickupSystem extends SubsystemBase {
  private WPI_TalonSRX kickupMotor = new WPI_TalonSRX(HopperConstants.kickupMotorID);

  /**
   * Creates a new KickupSystem.
   */
  public KickupSystem() {
    kickupMotor.configFactoryDefault();
    kickupMotor.setNeutralMode(NeutralMode.Brake);

  }

  public void kickup(double speed) {
    kickupMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
