package nika.facade;

import nika.command.RemoteControl;
import nika.command.commands.car.*;
import nika.command.commands.helicopter.*;
import nika.command.receivers.car.Car;
import nika.command.receivers.car.MuscleCar;
import nika.command.receivers.helicopter.Helicopter;

public class CommandFacade implements Facade {
    @Override
    public void compose() {
        Car muscleCar = new MuscleCar(8888, "Black");
        Helicopter helicopter = new Helicopter(1234, "Blue");

        RemoteControl muscleCarControl = new RemoteControl(
                new CarTurnLeftCommand(muscleCar),
                new CarTurnRightCommand(muscleCar),
                new CarAccelerateCommand(muscleCar),
                new CarBrakeCommand(muscleCar),
                new CarSpecialCommand(muscleCar)
        );

        RemoteControl helicopterControl = new RemoteControl(
                new HelicopterMoveLeftCommand(helicopter),
                new HelicopterMoveRightCommand(helicopter),
                new HelicopterMoveForwardCommand(helicopter),
                new HelicopterMoveBackCommand(helicopter),
                new HelicopterSpecialCommand(helicopter)
        );

        System.out.println("Car Control:\n");
        muscleCarControl.pressUpArrowButton();
        muscleCarControl.pressDownArrowButton();
        muscleCarControl.pressLeftArrowButton();
        muscleCarControl.pressRightArrowButton();
        muscleCarControl.pressSpecialButton();

        System.out.println("Helicopter Control:\n");
        helicopterControl.pressSpecialButton();
        helicopterControl.pressUpArrowButton();
        helicopterControl.pressDownArrowButton();
        helicopterControl.pressLeftArrowButton();
        helicopterControl.pressRightArrowButton();
        helicopterControl.pressSpecialButton();
    }
}
