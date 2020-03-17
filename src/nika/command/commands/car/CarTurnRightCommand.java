package nika.command.commands.car;

import nika.command.commands.Command;
import nika.command.receivers.car.Car;

public class CarTurnRightCommand implements Command {
    private Car car;

    public CarTurnRightCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }
}
