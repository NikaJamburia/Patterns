package nika.factory.factory;

import nika.factory.product.Audi;
import nika.factory.product.Car;

public class AudiFactory implements AbstractFactory{
	public Car getAudiR8() {
		return new Audi("r8", 20000, 230);
	}

	public Car getAudiA4() {
		return new Audi("a4", 15000, 180);
	}
}
