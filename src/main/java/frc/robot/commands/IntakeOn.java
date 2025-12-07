package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class IntakeOn extends Command{
  private final Intake m_Intake;

  public IntakeOn(Intake intake) {
    m_Intake = intake;
    addRequirements(intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_Intake.intaking();
  }

  @Override
  public void end(boolean interrupted) {
    m_Intake.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
  
}
