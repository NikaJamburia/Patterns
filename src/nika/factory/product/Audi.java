package nika.factory.product;

public class Audi extends Car {

	public Audi(String modelName, Integer price, Integer horsePower) {
		this.modelName = modelName;
		this.price = price;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Audi{" +
				"modelName='" + modelName + '\'' +
				", price=" + price +
				", horsePower=" + horsePower +
				'}';
	}

}
