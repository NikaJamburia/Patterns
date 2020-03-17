package nika.command.commands.car;

import nika.command.commands.Command;
import nika.command.receivers.car.Car;

public class CarTurnLeftCommand implements Command {
    private Car car;

    public CarTurnLeftCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }
}
