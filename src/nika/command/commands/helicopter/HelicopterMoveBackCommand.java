package nika.command.commands.helicopter;

import nika.command.commands.Command;
import nika.command.receivers.helicopter.Helicopter;

public class HelicopterMoveBackCommand implements Command {
    Helicopter helicopter;

    public HelicopterMoveBackCommand(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void execute() {
        helicopter.moveBack();
    }
}
