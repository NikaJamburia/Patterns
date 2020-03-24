package nika.composite;

import java.util.List;

public class Directory implements Component {
	private String name;
	private List<Component> components;



	public Directory(String name, List<Component> components) {
		this.name = name;
		this.components = components;
	}

	@Override
	public List<Component> open() {
		return components;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void print() {
		System.out.println(name + ":");
		components.forEach(c -> System.out.println(components.indexOf(c) + ". " + c.getName()));
	}

}
