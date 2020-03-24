package nika.composite;

import java.util.List;

public interface Component {
	List<Component> open();
	String getName();
	void print();
}
