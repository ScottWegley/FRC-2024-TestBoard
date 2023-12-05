package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Claw;

public class StopIntake extends CommandBase {

    private Claw claw;

    public StopIntake(Claw claw){
        this.claw = claw;
    }

    @Override
    public void initialize() {
        claw.stopIntake();
    }

    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
