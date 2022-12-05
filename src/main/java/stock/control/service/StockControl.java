package stock.control.service;

import stock.control.entities.base.Product;

import java.util.List;
import java.util.stream.Collectors;

public abstract class StockControl {
    public List<Product> substractQuantityAll(List<Product> products){
        return products.stream()
                .map(p -> {
                    try {
                        return substractQuantity(p);
                    } catch (Exception e) {
                        throw new RuntimeException("A few products was error in substract");
                    }
                })
                .collect(Collectors.toList());
    };
    public List<Product> addQuantityAll(List<Product> products){
        return products.stream()
                .map(p -> {
                    try {
                        return addQuantity(p);
                    } catch (Exception e) {
                        throw new RuntimeException("A few products was error in add");
                    }
                })
                .collect(Collectors.toList());
    };

    public void verifyPositive(Integer number) throws Exception {
        if (number < 0){
            throw new Exception("result negative");
        }
    }

    public Integer add(Integer a, Integer b) throws Exception {
        Integer result = a + b;
        verifyPositive(result);
        return result;
    }

    public Integer substract(Integer a, Integer b) throws Exception {
        Integer result = a + b;
        verifyPositive(result);
        return result;
    }

    public abstract Product substractQuantity(Product product) throws Exception;
    public abstract Product addQuantity(Product product) throws Exception;



}
