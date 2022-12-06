package stock.control.service;

import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;

import java.util.List;
import java.util.stream.Collectors;

public abstract class StockControl {
    public List<Quantity> substractQuantityAll(List<Quantity> quantities){
        return quantities.stream()
                .map(p -> {
                    try {
                        return substractQuantity(p);
                    } catch (Exception e) {
                        throw new RuntimeException("A few products was error in substract");
                    }
                })
                .collect(Collectors.toList());
    };
    public List<Quantity> addQuantityAll(List<Quantity> products){
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

    public void verifyPositive(Number number) throws Exception {
        boolean result = false;
        if (Integer.class.equals(number.getClass())) {
            result = (int) number >= 0;
        } else if (Double.class.equals(number.getClass())) {
            result = (double) number >= 0;
        }
        if (!result){
            throw new Exception("number is negative");
        }
    }

    public Integer add(Integer a, Integer b) throws Exception {
        Integer result = a + b;
        verifyPositive(result);
        return result;
    }
    public Double add(Double a, Double b) throws Exception {
        Double result = a + b;
        verifyPositive(result);
        return result;
    }

    public Integer substract(Integer a, Integer b) throws Exception {
        Integer result = a - b;
        verifyPositive(result);
        return result;
    }
    public Double substract(Double a, Double b) throws Exception {
        Double result = a - b;
        verifyPositive(result);
        return result;
    }

    public abstract Quantity substractQuantity(Quantity quantity) throws Exception;
    public abstract Quantity addQuantity(Quantity quantity) throws Exception;



}
