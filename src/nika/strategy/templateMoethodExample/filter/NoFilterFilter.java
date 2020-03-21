package nika.strategy.templateMoethodExample.filter;

import nika.templateMethod.Product;

import java.util.List;

public class NoFilterFilter implements Filter<Product> {
    @Override
    public List<Product> applyFilter(List<Product> products) {
        return products;
    }
}
