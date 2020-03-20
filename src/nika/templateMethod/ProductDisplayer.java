package nika.templateMethod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ProductDisplayer {
	protected List<Product> products;

	public abstract List<Product> filterProducts();
	public abstract String toDisplayable();

	private List<Product> sortProducts() {
		return products.stream()
				.sorted(Comparator.comparing(Product::getName))
				.collect(Collectors.toList());
	}

	public void display() {
		products = filterProducts();
		products = sortProducts();
		System.out.println(toDisplayable());
	}

}
