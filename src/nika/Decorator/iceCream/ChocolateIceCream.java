package nika.Decorator.iceCream;

public class ChocolateIceCream implements IceCream {
	private String name;
	private Integer price;

	public ChocolateIceCream() {
		name = "Chocolate ice cream";
		price = 3;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}
}
