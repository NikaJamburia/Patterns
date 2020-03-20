package nika.templateMethod;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByCategoryHtmlTableDisplayer extends ProductDisplayer {
	private ProductCategory categoryToFilter;

	public FilterByCategoryHtmlTableDisplayer(List<Product> products, ProductCategory categoryToFilter) {
		this.products = products;
		this.categoryToFilter = categoryToFilter;
	}

	@Override
	public List<Product> filterProducts() {
		return products.stream()
				.filter(p -> p.getCategory().equals(categoryToFilter))
				.collect(Collectors.toList());
	}

	@Override
	public String toDisplayable() {
		StringBuilder result = new StringBuilder("<table>\n\t<thead>\n\t\t<td>Name</td>\n\t\t<td>Price</td>\n\t\t<td>Category</td>\n\t</thead>\n<tbody>\n\t");
		products.forEach(p -> {
			result.append("<tr>\n\t\t");

			result.append("<td>");
			result.append(p.getName());
			result.append("/<td>\n\t\t");

			result.append("<td>");
			result.append(p.getPrice());
			result.append("/<td>\n\t\t");

			result.append("<td>");
			result.append(p.getCategory().toString());
			result.append("/<td>\n\t\t");

			result.append("</tr>\n\t");
		});
		result.append("</table>");
		return result.toString();
	}
}
