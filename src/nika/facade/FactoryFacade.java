package nika.facade;

import nika.factory.factory.AudiFactory;
import nika.factory.factory.SubaruFactory;
import nika.factory.product.Car;

import java.util.ArrayList;
import java.util.List;

public class FactoryFacade implements Facade {
	@Override
	public void compose() {
		AudiFactory audiFactory = new AudiFactory();
		SubaruFactory subaruFactory = new SubaruFactory();
		List<Car> cars = new ArrayList<>();
		cars.add(subaruFactory.getSubaruImprezaWrxSti());
		cars.add(subaruFactory.getSubaruImpreza());
		cars.add(audiFactory.getAudiR8());
		cars.add(audiFactory.getAudiA4());
		cars.add(subaruFactory.getSubaruForesterSti());

		cars.forEach(System.out::println);
	}
}
