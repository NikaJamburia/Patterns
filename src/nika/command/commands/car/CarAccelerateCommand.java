package nika.command.commands.car;

import nika.command.commands.Command;
import nika.command.receivers.car.Car;

public class CarAccelerateCommand implements Command {
    private Car car;

    public CarAccelerateCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
