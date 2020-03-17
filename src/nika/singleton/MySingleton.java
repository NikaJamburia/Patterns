package nika.singleton;

public class MySingleton {
	private static MySingleton instance;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (instance == null) {
			System.out.println("Instance does not exist. Creating new one");
			instance = new MySingleton();
			return instance;
		}
		System.out.println("Instance Already exists");
		return instance;
	}

	public void doSomething() {
		System.out.println("Doing some work");
	}
}
