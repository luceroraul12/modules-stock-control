package stock.control.service.implementation;

import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;
import stock.control.enums.KindOfQuantity;
import stock.control.service.StockControl;

import java.util.List;

public class StockControlService extends StockControl {
    @Override
public Quantity substractQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();

        Integer integerActual = q.getInteger();
        Integer integerOperate = q.getIntegerOperate();
        int integerResult;

        Integer decimalActual = q.getDecimal();
        Integer decimalOperate = q.getDecimalOperate();
        int decimalResult;

        integerResult = substract(integerActual, integerOperate);
        decimalResult = substract(decimalActual, decimalOperate);

        q.setInteger(integerResult);
        q.setDecimal(decimalResult);

        return q;
    }

    @Override
    public Quantity addQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();
        Integer integerActual = q.getInteger();
        Integer integerOperate = q.getIntegerOperate();
        int integerResult;
        Integer decimalActual = q.getDecimal();
        Integer decimalOperate = q.getDecimalOperate();
        int decimalResult;

        integerResult = add(integerActual, integerOperate);
        decimalResult = add(decimalActual, decimalOperate);

        q.setInteger(integerResult);
        q.setDecimal(decimalResult);

        return q;
    }
}
