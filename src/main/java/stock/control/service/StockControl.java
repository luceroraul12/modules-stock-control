package stock.control.service;

import stock.control.entities.base.Product;

import java.util.List;
import java.util.stream.Collectors;

public abstract class StockControl {
    public List<Product> substractQuantityAll(List<Product> products){
        return products.stream()
                .map(this::substractQuantity)
                .collect(Collectors.toList());
    };
    public List<Product> addQuantityAll(List<Product> products){
        return products.stream()
                .map(this::addQuantity)
                .collect(Collectors.toList());
    };

    public boolean verifyPositive(Integer number){
        return number >= 0;
    }

    public abstract Product substractQuantity(Product product);
    public abstract Product addQuantity(Product product);



}
