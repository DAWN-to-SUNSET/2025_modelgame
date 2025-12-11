package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Transfer;

public class TransferOn extends Command {
  private final Transfer m_transfer;

  public TransferOn(Transfer transfer) {
    m_transfer = transfer;
    addRequirements(transfer);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_transfer.transferring();
  }

  @Override
  public void end(boolean interrupted) {
    m_transfer.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
