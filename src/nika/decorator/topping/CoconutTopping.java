package nika.decorator.topping;

import nika.decorator.iceCream.IceCream;

public class CoconutTopping extends Topping {
	private String name;
	private Integer price;

	public CoconutTopping(IceCream iceCream) {
		name = "coconut topping";
		price = 2;
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
