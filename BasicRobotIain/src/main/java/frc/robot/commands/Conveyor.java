/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Hopper;
import frc.robot.Constants.*;

public class Conveyor extends CommandBase {
  private final Hopper hopper;


  /**
   * Creates a new Conveyor.
   */
  public Conveyor(Hopper hopper) {
    this.hopper = hopper;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.hopper);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    hopper.conveyor(true);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (hopper.conveyorRunning() == false) {
      hopper.conveyor(true);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hopper.conveyor(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
