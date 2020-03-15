package nika.Observer;

public class TemperatureDisplay implements Observer {
	private Integer temperature;
	private Thermometer thermometer;

	public TemperatureDisplay(Thermometer thermometer) {
		this.thermometer = thermometer;
		this.temperature = this.thermometer.getTemperature();
		System.out.println(display());
	}

	@Override
	public void update() {
		System.out.println("Update!");
		this.temperature = thermometer.getTemperature();
		System.out.println(display());
	}


	private String display() {
		return this.getClass().getSimpleName() + " : Current Temperature - " + temperature;
	}
}
