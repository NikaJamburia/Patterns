package nika.strategy.templateMoethodExample.displayer;

import nika.templateMethod.Product;

import java.util.List;

public interface Displayer<T> {
    String display(List<T> products);
}
