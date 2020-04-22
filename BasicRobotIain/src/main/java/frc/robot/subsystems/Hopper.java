/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*;

public class Hopper extends SubsystemBase {

  private CANSparkMax flywheelMotor = new CANSparkMax(HopperConstants.flywheelMotorID, MotorType.kBrushless);
  private CANSparkMax conveyorMotor = new CANSparkMax(HopperConstants.conveyorMotorID, MotorType.kBrushless);
  private TalonSRX kickupMotor = new TalonSRX(HopperConstants.kickupMotorID);

  /**
   * Creates a new Hopper.
   */
  public Hopper() {
    restoreFactoryDefaults();

    flywheelMotor.setIdleMode(IdleMode.kCoast);
    conveyorMotor.setIdleMode(IdleMode.kBrake);

  }

  private void restoreFactoryDefaults(){
    flywheelMotor.restoreFactoryDefaults();
    conveyorMotor.restoreFactoryDefaults();
    kickupMotor.configFactoryDefault();
  }

  public void conveyor(boolean go){
    if(go == true){
      conveyorMotor.set(HopperConstants.conveyorSpeed);
    }
    else if(go == false){
      conveyorMotor.set(0);
    }
  }

  public boolean conveyorRunning(){
    return conveyorMotor.get() != 0;
  }

  public void kickup(boolean go){
    if(go == true){
      kickupMotor.set(ControlMode.PercentOutput, HopperConstants.kickupSpeed);
    }
    else if(go == false){
      kickupMotor.set(ControlMode.PercentOutput, 0);
    }
  }

  public boolean kickupRunning(){
    return kickupMotor.getMotorOutputPercent() != 0;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
