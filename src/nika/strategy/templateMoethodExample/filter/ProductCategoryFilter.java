package nika.strategy.templateMoethodExample.filter;

import nika.templateMethod.Product;
import nika.templateMethod.ProductCategory;

import java.util.List;
import java.util.stream.Collectors;

public class ProductCategoryFilter implements Filter<Product> {
    private ProductCategory category;

    public ProductCategoryFilter(ProductCategory category) {
        this.category = category;
    }

    @Override
    public List<Product> applyFilter(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
