package nika.templateMethod;

public class Product {
	private Integer price;
	private String name;
	private ProductCategory category;

	public Product(Integer price, String name, ProductCategory category) {
		this.price = price;
		this.name = name;
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}
}
