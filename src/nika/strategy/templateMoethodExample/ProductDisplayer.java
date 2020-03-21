package nika.strategy.templateMoethodExample;

import nika.strategy.templateMoethodExample.displayer.Displayer;
import nika.strategy.templateMoethodExample.filter.Filter;
import nika.strategy.templateMoethodExample.sorter.Sorter;
import nika.templateMethod.Product;

import java.util.List;

public class ProductDisplayer {
    private List<Product> products;
    private Filter<Product> filter;
    private Sorter<Product> sorter;
    private Displayer<Product> displayer;

    public ProductDisplayer(List<Product> products, Filter<Product> filter, Sorter<Product> sorter, Displayer<Product> displayer) {
        this.products = products;
        this.filter = filter;
        this.sorter = sorter;
        this.displayer = displayer;
    }

    public void display() {
        products = filter.applyFilter(products);
        products = sorter.sort(products);
        System.out.println(displayer.display(products));
    }


}
