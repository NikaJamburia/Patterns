package nika.facade;

import nika.singleton.MySingleton;

public class SingletonFacade implements Facade {
	@Override
	public void compose() {
		// This wont work: MySingleton mySingleton = new MySingleton();
		MySingleton mySingleton1 = MySingleton.getInstance();
		mySingleton1.doSomething();

		MySingleton mySingleton2 = MySingleton.getInstance();

		System.out.println("singleton1: " + mySingleton1);
		System.out.println("singleton2: " + mySingleton2);
	}
}
