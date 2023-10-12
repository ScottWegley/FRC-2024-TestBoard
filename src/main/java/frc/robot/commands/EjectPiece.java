package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Claw;

public class EjectPiece extends CommandBase{
    private Claw claw;

    public EjectPiece(Claw claw){
        this.claw = claw;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        claw.runIntake(true);
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
