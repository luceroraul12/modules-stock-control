package stock.control.service.implementation;

import stock.control.entities.base.Quantity;
import stock.control.enums.KindOfQuantity;
import stock.control.service.StockControl;

import java.util.List;

public class StockControlService extends StockControl {
    @Override
public Quantity substractQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();

        Integer integerActual = q.getQuantityInteger();
        Integer integerOperate = q.getQuantityIntegerOperate();
        int integerResult;


        integerResult = substract(integerActual, integerOperate);

        q.setQuantityInteger(integerResult);

        return q;
    }

    @Override
    public Quantity addQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();
        Integer integerActual = q.getQuantityInteger();
        Integer integerOperate = q.getQuantityIntegerOperate();
        int integerResult;

        integerResult = add(integerActual, integerOperate);

        q.setQuantityInteger(integerResult);

        return q;
    }
}
