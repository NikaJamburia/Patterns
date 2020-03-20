package nika.templateMethod;

import java.util.List;
import java.util.stream.Collectors;

public class SearchBynameListDisplayer extends ProductDisplayer {
	private String keyWord;

	public SearchBynameListDisplayer(List<Product> products, String keyWord) {
		this.products = products;
		this.keyWord = keyWord;
	}

	@Override
	public List<Product> filterProducts() {
		return products.stream()
				.filter(p -> p.getName().contains(keyWord))
				.collect(Collectors.toList());
	}

	@Override
	public String toDisplayable() {
		StringBuilder result = new StringBuilder();
		int count = 0;

		for (Product product : products) {
			count++;
			result.append(count);
			result.append(". ");
			result.append(product.getName()).append(" ").append(product.getPrice()).append(" ").append(product.getCategory());
			result.append("\n");
		}
		return result.toString();
	}
}
