package nika.facade;

import nika.decorator.iceCream.ChocolateIceCream;
import nika.decorator.iceCream.IceCream;
import nika.decorator.iceCream.VanillaIceCream;
import nika.decorator.topping.CacaoTopping;
import nika.decorator.topping.CoconutTopping;

public class DecoratorFacade {
	public DecoratorFacade() {
		System.out.println("----------------------------\nDecorator:");
		IceCream vanillaIceCreamWithCacaoTopping = new CacaoTopping(new VanillaIceCream());
		System.out.println(vanillaIceCreamWithCacaoTopping.getName() + " | Price: " + vanillaIceCreamWithCacaoTopping.getPrice());

		IceCream chocolateIceCreamWithCacaoAndCoconutTopping = new CoconutTopping(new CacaoTopping(new ChocolateIceCream()));
		System.out.println(chocolateIceCreamWithCacaoAndCoconutTopping.getName() + " | Price: " + chocolateIceCreamWithCacaoAndCoconutTopping.getPrice());
		System.out.println("----------------------------");
	}
}
