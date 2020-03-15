package nika.Facade;

import nika.Decorator.iceCream.ChocolateIceCream;
import nika.Decorator.iceCream.IceCream;
import nika.Decorator.iceCream.VanillaIceCream;
import nika.Decorator.topping.CacaoTopping;
import nika.Decorator.topping.CoconutTopping;

public class DecoratorFacade {
	public DecoratorFacade() {
		IceCream vanillaIceCreamWithCacaoTopping = new CacaoTopping(new VanillaIceCream());
		System.out.println(vanillaIceCreamWithCacaoTopping.getName() + " | Price: " + vanillaIceCreamWithCacaoTopping.getPrice());

		IceCream chocolateIceCreamWithCacaoAndCoconutTopping = new CoconutTopping(new CacaoTopping(new ChocolateIceCream()));
		System.out.println(chocolateIceCreamWithCacaoAndCoconutTopping.getName() + " | Price: " + chocolateIceCreamWithCacaoAndCoconutTopping.getPrice());
	}
}
