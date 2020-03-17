package nika.command.commands.helicopter;

import nika.command.commands.Command;
import nika.command.receivers.helicopter.Helicopter;

public class HelicopterMoveForwardCommand implements Command {
    Helicopter helicopter;

    public HelicopterMoveForwardCommand(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void execute() {
        helicopter.moveForward();
    }
}
