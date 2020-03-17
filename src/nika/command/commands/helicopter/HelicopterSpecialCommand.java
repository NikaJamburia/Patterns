package nika.command.commands.helicopter;

import nika.command.commands.Command;
import nika.command.receivers.helicopter.Helicopter;

public class HelicopterSpecialCommand implements Command {
    Helicopter helicopter;

    public HelicopterSpecialCommand(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    @Override
    public void execute() {
        helicopter.special();
    }
}
