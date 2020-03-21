package nika.strategy.templateMoethodExample.filter;

import nika.templateMethod.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductSearchByNameFilter implements Filter<Product> {
    private String keyword;

    public ProductSearchByNameFilter(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public List<Product> applyFilter(List<Product> products) {
        return products.stream().filter(p -> p.getName().contains(keyword)).collect(Collectors.toList());
    }
}
