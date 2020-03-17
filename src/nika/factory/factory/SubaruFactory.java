package nika.factory.factory;

import nika.factory.product.Car;
import nika.factory.product.Subaru;

import java.util.Arrays;
import java.util.List;

public class SubaruFactory {
	public Car getSubaruImpreza() {
		return new Subaru("Impreza", 20000, 300);
	}

	public Car getSubaruImprezaWrxSti() {
		List<String> mods = Arrays.asList("WRX", "Sti");
		return new Subaru("Impreza", 20000, 300, mods);
	}

	public Car getSubaruForesterSti() {
		List<String> mods = Arrays.asList("Sti");
		return new Subaru("Forester", 20000, 300, mods);
	}
}
