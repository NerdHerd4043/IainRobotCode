/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConveyorSystem;
import frc.robot.Constants.HopperConstants;

public class Conveyor extends CommandBase {
  private final ConveyorSystem conveyorSystem;


  /**
   * Creates a new Conveyor.
   */
  public Conveyor(ConveyorSystem conveyorSystem) {
    this.conveyorSystem = conveyorSystem;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.conveyorSystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    conveyorSystem.conveyor(HopperConstants.conveyorSpeed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    conveyorSystem.conveyor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
