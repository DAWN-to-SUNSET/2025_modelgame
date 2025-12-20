// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Direction;


public class Turning extends Command {
  private final Direction m_direction;
  private Supplier<Double> left;
  private Supplier<Double> right;

  public Turning(Direction direction, Supplier<Double> _left, Supplier<Double> _right) {
    m_direction = direction;
    left = _left;
    right = _right;
    addRequirements(direction);
  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_direction.turn(left.get(), right.get());
  }

  
  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
