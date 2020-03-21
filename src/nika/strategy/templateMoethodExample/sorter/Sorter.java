package nika.strategy.templateMoethodExample.sorter;

import nika.templateMethod.Product;

import java.util.List;

public interface Sorter<T> {
    List<T> sort(List<T> products);
}
