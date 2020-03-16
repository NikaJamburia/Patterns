package nika.Facade;

import nika.Observer.TemperatureDisplay;
import nika.Observer.Thermometer;

public class ObserverFacade {
	public ObserverFacade() {
		System.out.println("----------------------------\nObserver:");
		Thermometer thermometer = new Thermometer(0, 0);
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay(thermometer);

		thermometer.add(temperatureDisplay);

		thermometer.setTemperature(10);
		System.out.println("----------------------------\n");
	}
}
