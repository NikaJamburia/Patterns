package nika.command.commands.helicopter;

import nika.command.commands.Command;
import nika.command.receivers.helicopter.Helicopter;

public class HelicopterMoveLeftCommand implements Command {
    Helicopter helicopter;

    public HelicopterMoveLeftCommand(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void execute() {
        helicopter.moveLeft();
    }
}
