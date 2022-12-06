package stock.control.service;

import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;

import java.util.List;
import java.util.stream.Collectors;

public abstract class StockControl {
    /**
     * Apply {@link StockControl#substractQuantity(Quantity)}to each quantity from list
     * @param quantities
     * @return quantity list modified
     */
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

    /**
     * Apply {{@link StockControl#addQuantity(Quantity)}} to each quiantity from list
     * @param products
     * @return quantity list modified
     */
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

    /**
     * Verify if a number is positive, If isnt, throw exception
     * @param number
     * @throws Exception
     */
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

    /**
     * add two numbers, if result is negative, throw exception
     * @param a
     * @param b
     * @return result substracted
     * @throws Exception
     */
    public Integer add(Integer a, Integer b) throws Exception {
        Integer result = a + b;
        verifyPositive(result);
        return result;
    }

    /**
     * add two numbers, if result is negative, throw exception
     * @param a
     * @param b
     * @return result added
     * @throws Exception
     */
    public Double add(Double a, Double b) throws Exception {
        Double result = a + b;
        verifyPositive(result);
        return result;
    }

    /**
     * substract two numbers, if result is negative throw exception
     * @param a
     * @param b
     * @return result added
     * @throws Exception
     */
    public Integer substract(Integer a, Integer b) throws Exception {
        Integer result = a - b;
        verifyPositive(result);
        return result;
    }

    /**
     * substract two numbers, if result is negative throw exception
     * @param a
     * @param b
     * @return result substracted
     * @throws Exception
     */
    public Double substract(Double a, Double b) throws Exception {
        Double result = a - b;
        verifyPositive(result);
        return result;
    }

    /**
     * substract a quantity to a Quantity object
     * @param quantity
     * @return quantity modified
     * @throws Exception
     */
    public abstract Quantity substractQuantity(Quantity quantity) throws Exception;

    /**
     * add a quiantity to a Quantity object
     * @param quantity
     * @return quantity modified
     * @throws Exception
     */
    public abstract Quantity addQuantity(Quantity quantity) throws Exception;



}
