package nika.Decorator.iceCream;

public class VanillaIceCream implements IceCream {

	private String name;
	private Integer price;

	public VanillaIceCream() {
		name = "Vanilla ice cream";
		price = 2;
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
