package nika.decorator.topping;

import nika.decorator.iceCream.IceCream;

public abstract class Topping implements IceCream { // A decorator
	protected IceCream iceCream;
}
