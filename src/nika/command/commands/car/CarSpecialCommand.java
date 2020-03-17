package nika.command.commands.car;

import nika.command.commands.Command;
import nika.command.receivers.car.Car;

public class CarSpecialCommand implements Command {
    private Car car;

    public CarSpecialCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.special();
    }
}
