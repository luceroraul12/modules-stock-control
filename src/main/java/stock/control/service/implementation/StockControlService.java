package stock.control.service.implementation;

import stock.control.entities.base.Product;
import stock.control.enums.KindOfQuantity;
import stock.control.service.StockControl;

import java.util.List;

public class StockControlService extends StockControl {
    @Override
    public Product substractQuantity(Product product) throws Exception {
        KindOfQuantity kindOfQuantity = product.getQuantity().getKindOfQuantity();

        Integer integerActual = product.getQuantity().getInteger();
        Integer integerOperate = product.getQuantity().getIntegerOperate();
        int integerResult;

        Integer decimalActual = product.getQuantity().getDecimal();
        Integer decimalOperate = product.getQuantity().getDecimalOperate();
        int decimalResult;

        integerResult = substract(integerActual, integerOperate);
        decimalResult = substract(decimalActual, decimalOperate);

        product.getQuantity().setInteger(integerResult);
        product.getQuantity().setDecimal(decimalResult);

        return product;
    }

    @Override
    public Product addQuantity(Product product) throws Exception {
        KindOfQuantity kindOfQuantity = product.getQuantity().getKindOfQuantity();
        Integer integerActual = product.getQuantity().getInteger();
        Integer integerOperate = product.getQuantity().getIntegerOperate();
        int integerResult;
        Integer decimalActual = product.getQuantity().getDecimal();
        Integer decimalOperate = product.getQuantity().getDecimalOperate();
        int decimalResult;

        integerResult = add(integerActual, integerOperate);
        decimalResult = add(decimalActual, decimalOperate);

        product.getQuantity().setInteger(integerResult);
        product.getQuantity().setDecimal(decimalResult);

        return product;
    }
}
