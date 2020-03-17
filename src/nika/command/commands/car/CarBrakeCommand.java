package nika.command.commands.car;

import nika.command.commands.Command;
import nika.command.receivers.car.Car;

public class CarBrakeCommand implements Command {
    private Car car;

    public CarBrakeCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.brake();
    }
}
