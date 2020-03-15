package nika.Observer;

import java.util.ArrayList;
import java.util.List;

public class Thermometer implements Observable {

	private Integer temperature;
	private Integer humidity;

	private List<Observer> observers = new ArrayList<>();

	public Thermometer(Integer temperature, Integer humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		notifyObservers();
		this.temperature = temperature;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		notifyObservers();
		this.humidity = humidity;
	}

}
