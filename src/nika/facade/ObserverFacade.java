package nika.facade;

import nika.observer.TemperatureDisplay;
import nika.observer.Thermometer;

public class ObserverFacade  implements Facade {
	@Override
	public void compose() {
		Thermometer thermometer = new Thermometer(0, 0);
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay(thermometer);

		thermometer.add(temperatureDisplay);

		thermometer.setTemperature(10);
	}
}
