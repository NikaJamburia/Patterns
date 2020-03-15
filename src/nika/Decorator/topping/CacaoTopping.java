package nika.Decorator.topping;

import nika.Decorator.iceCream.IceCream;

public class CacaoTopping extends Topping {
	private String name;
	private Integer price;

	public CacaoTopping(IceCream iceCream) {
		name = "cacao topping";
		price = 1;
		super.iceCream = iceCream;
	}

	@Override
	public String getName() {
		return iceCream.getName() + " with " + name;
	}

	@Override
	public Integer getPrice() {
		return iceCream.getPrice() + price;
	}
}
