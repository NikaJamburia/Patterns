package nika.composite;

import java.util.Collections;
import java.util.List;

public class File implements Component {
	private String name;
	private String content;

	public File(String name, String content) {
		this.name = name;
		this.content = content;
	}

	@Override
	public List<Component> open() {
		return Collections.singletonList(this);
	}


	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void print() {
		System.out.println(name + ":");
		System.out.println(content);
	}
}
