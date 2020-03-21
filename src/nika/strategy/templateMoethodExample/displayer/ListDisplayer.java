package nika.strategy.templateMoethodExample.displayer;

import nika.templateMethod.Product;

import java.util.List;

public class ListDisplayer implements Displayer<Product> {
    @Override
    public String display(List<Product> products) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (Product product : products) {
            count++;
            result.append(count);
            result.append(". ");
            result.append(product.getName()).append(" ").append(product.getPrice()).append(" ").append(product.getCategory());
            result.append("\n");
        }
        return result.toString();
    }
}
