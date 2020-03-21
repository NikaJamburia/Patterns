package nika.strategy.templateMoethodExample.filter;

import nika.templateMethod.Product;

import java.util.List;

public interface Filter<T> {
    List<T> applyFilter(List<T> products);
}
