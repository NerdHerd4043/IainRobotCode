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
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.HopperConstants;

public class ConveyorSystem extends SubsystemBase {
  private CANSparkMax conveyorMotor = new CANSparkMax(HopperConstants.conveyorMotorID, MotorType.kBrushless);

  /**
   * Creates a new ConveyorSystem.
   */
  public ConveyorSystem() {
    conveyorMotor.restoreFactoryDefaults();

    conveyorMotor.setIdleMode(IdleMode.kBrake);
  }

  public void conveyor(double speed) {
    conveyorMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
