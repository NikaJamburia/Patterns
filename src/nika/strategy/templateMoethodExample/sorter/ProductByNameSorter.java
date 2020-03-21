package nika.strategy.templateMoethodExample.sorter;

import nika.templateMethod.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductByNameSorter implements Sorter<Product> {
    @Override
    public List<Product> sort(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }
}
