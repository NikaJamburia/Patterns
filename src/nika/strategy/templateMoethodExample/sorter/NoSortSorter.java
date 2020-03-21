package nika.strategy.templateMoethodExample.sorter;

import nika.templateMethod.Product;

import java.util.List;

public class NoSortSorter implements Sorter<Product> {
    @Override
    public List<Product> sort(List<Product> products) {
        return products;
    }
}
