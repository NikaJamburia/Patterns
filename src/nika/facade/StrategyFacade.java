package nika.facade;

import nika.strategy.templateMoethodExample.ProductDisplayer;
import nika.strategy.templateMoethodExample.displayer.HtmlTableDisplayer;
import nika.strategy.templateMoethodExample.displayer.ListDisplayer;
import nika.strategy.templateMoethodExample.filter.NoFilterFilter;
import nika.strategy.templateMoethodExample.filter.ProductCategoryFilter;
import nika.strategy.templateMoethodExample.filter.ProductSearchByNameFilter;
import nika.strategy.templateMoethodExample.sorter.NoSortSorter;
import nika.strategy.templateMoethodExample.sorter.ProductByPriceSorter;
import nika.strategy.templateMoethodExample.sorter.Sorter;
import nika.templateMethod.Product;
import nika.templateMethod.ProductCategory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StrategyFacade implements Facade {
    @Override
    public void compose() {
        List<Product> products = Arrays.asList(
                new Product(10, "Meat", ProductCategory.FOOD),
                new Product(12, "T-shirt", ProductCategory.CLOTHES),
                new Product(3, "Snickers", ProductCategory.FOOD),
                new Product(7, "Candy", ProductCategory.FOOD),
                new Product(9, "Xinkali", ProductCategory.FOOD),
                new Product(26, "Toaster", ProductCategory.APPLIANCES),
                new Product(31, "Better toaster", ProductCategory.APPLIANCES),
                new Product(44, "Headphones", ProductCategory.APPLIANCES),
                new Product(64, "Jeans", ProductCategory.CLOTHES),
                new Product(78, "Jacket", ProductCategory.CLOTHES)
        );

        ProductDisplayer noFilterNoSortListDisplayer = new ProductDisplayer(
                products,
                new NoFilterFilter(),
                new NoSortSorter(),
                new ListDisplayer());
        noFilterNoSortListDisplayer.display();

        ProductDisplayer searchByNameSortByPriceHtmlDisplayer = new ProductDisplayer(
                products,
                new ProductSearchByNameFilter("er"),
                new ProductByPriceSorter(),
                new HtmlTableDisplayer());
        searchByNameSortByPriceHtmlDisplayer.display();

        ProductDisplayer filterByCategorySortByNameLengthyWriterDisplayer = new ProductDisplayer(
                products,
                new ProductCategoryFilter(ProductCategory.FOOD),
                productList -> productList.stream()
                         .sorted(Comparator.comparing(p -> p.getName().length()))
                         .collect(Collectors.toList()),
                new ListDisplayer()
        );
        filterByCategorySortByNameLengthyWriterDisplayer.display();


    }
}
