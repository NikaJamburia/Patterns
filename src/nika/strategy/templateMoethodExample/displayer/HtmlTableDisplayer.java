package nika.strategy.templateMoethodExample.displayer;

import nika.templateMethod.Product;

import java.util.List;

public class HtmlTableDisplayer implements Displayer<Product> {
    @Override
    public String display(List<Product> products) {
        StringBuilder result = new StringBuilder("<table>\n\t<thead>\n\t\t<td>Name</td>\n\t\t<td>Price</td>\n\t\t<td>Category</td>\n\t</thead>\n<tbody>\n\t");
        products.forEach(p -> {
            result.append("<tr>\n\t\t");

            result.append("<td>");
            result.append(p.getName());
            result.append("/<td>\n\t\t");

            result.append("<td>");
            result.append(p.getPrice());
            result.append("/<td>\n\t\t");

            result.append("<td>");
            result.append(p.getCategory().toString());
            result.append("/<td>\n\t\t");

            result.append("</tr>\n\t");
        });
        result.append("</table>");
        return result.toString();
    }
}
