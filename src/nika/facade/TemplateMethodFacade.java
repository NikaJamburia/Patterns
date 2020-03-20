package nika.facade;

import nika.templateMethod.*;

import java.util.Arrays;
import java.util.List;

public class TemplateMethodFacade implements Facade {
	@Override
	public void compose() {
		List<Product> products = Arrays.asList(
				new Product(10, "Meat", ProductCategory.FOOD),
				new Product(12, "T-shirt", ProductCategory.CLOTHES),
				new Product(3, "Snickers", ProductCategory.FOOD),
				new Product(7, "Candy", ProductCategory.FOOD),
				new Product(9, "Xinkali", ProductCategory.FOOD),
				new Product(26, "Toaster", ProductCategory.APPLIANCES),
				new Product(31, "Better toaster", ProductCategory.APPLIANCES),
				new Product(44, "Headphones", ProductCategory.APPLIANCES),
				new Product(64, "Jeans", ProductCategory.CLOTHES),
				new Product(78, "Jacket", ProductCategory.CLOTHES)
		);

		ProductDisplayer foodHtmlDisplayer = new FilterByCategoryHtmlTableDisplayer(products, ProductCategory.FOOD);
		foodHtmlDisplayer.display();

		System.out.println();
		System.out.println("----");
		System.out.println();

		ProductDisplayer searchListDisplayer = new SearchBynameListDisplayer(products, "er");
		searchListDisplayer.display();
	}
}
