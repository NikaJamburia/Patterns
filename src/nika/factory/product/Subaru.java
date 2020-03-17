package nika.factory.product;

import java.util.Collections;
import java.util.List;

public class Subaru extends Car {
	private List<String> mods;

	public Subaru(String modelName, Integer price, Integer horsePower, List<String> mods) {
		this.modelName = modelName;
		this.price = price;
		this.horsePower = horsePower;
		this.mods = mods;
	}

	public Subaru(String modelName, Integer price, Integer horsePower) {
		this.modelName = modelName;
		this.price = price;
		this.horsePower = horsePower;
		this.mods = Collections.emptyList();
	}

	@Override
	public String toString() {
		return "Subaru{" +
				"modelName='" + modelName + " " + getMods() + '\'' +
				", price=" + price +
				", horsePower=" + horsePower +
				'}';
	}

	private String getMods() {
		return mods.stream().reduce("", String::concat);
	}
}
