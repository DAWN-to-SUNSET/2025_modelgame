package frc.robot.commands;

import frc.robot.subsystems.*;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

public class Move extends Command {
	private final TankDrive m_tankdrive;
  private Supplier<Double> y;
  private Supplier<Double> x;

	public Move(TankDrive tankdrive, Supplier<Double> _x, Supplier<Double> _y) {
		m_tankdrive = tankdrive;
    y = _y;
    x = _x;
		addRequirements(tankdrive);
	}

	@Override
  public void initialize() {}

  @Override
  public void execute() {
		m_tankdrive.drive(x.get(),y.get());  //undone
	}

  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
