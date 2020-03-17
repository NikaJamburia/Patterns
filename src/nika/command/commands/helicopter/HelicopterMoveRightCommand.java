package nika.command.commands.helicopter;

import nika.command.commands.Command;
import nika.command.receivers.helicopter.Helicopter;

public class HelicopterMoveRightCommand implements Command {
    Helicopter helicopter;

    public HelicopterMoveRightCommand(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void execute() {
        helicopter.moveRight();
    }
}
