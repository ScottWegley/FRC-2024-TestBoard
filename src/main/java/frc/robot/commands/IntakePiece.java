package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Claw;

public class IntakePiece extends CommandBase {
    private Claw claw;

    public IntakePiece(Claw claw){
        this.claw = claw;
    }

    @Override
    public void initialize() {
        claw.runIntake(false);
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
        claw.stopIntake();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
