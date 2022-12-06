package stock.control.service.implementation;

import stock.control.entities.base.Quantity;
import stock.control.enums.KindOfQuantity;
import stock.control.service.StockControl;

import java.util.List;

public class StockControlService extends StockControl {
    @Override
public Quantity substractQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();

        switch (kindOfQuantity){
            case UNIT -> {
                Integer integerActual = q.getQuantityInteger();
                Integer integerOperate = q.getQuantityIntegerOperate();
                int integerResult;
                integerResult = substract(integerActual, integerOperate);
                verifyPositive(integerResult);
                q.setQuantityInteger(integerResult);
            }
            case WHEIGHT -> {
                Double doubleActual = q.getQuantityDouble();
                Double doubleOperate = q.getQuantityDoubleOperate();
                double doubleResult;
                doubleResult = substract(doubleActual, doubleOperate);
                verifyPositive(doubleResult);
                q.setQuantityDouble(doubleResult);
            }

        }



        return q;
    }

    @Override
    public Quantity addQuantity(Quantity q) throws Exception {
        KindOfQuantity kindOfQuantity = q.getKindOfQuantity();

        switch (kindOfQuantity){
            case UNIT -> {
                Integer integerActual = q.getQuantityInteger();
                Integer integerOperate = q.getQuantityIntegerOperate();
                int integerResult;
                integerResult = add(integerActual, integerOperate);
                verifyPositive(integerResult);
                q.setQuantityInteger(integerResult);
            }
            case WHEIGHT -> {
                Double doubleActual = q.getQuantityDouble();
                Double doubleOperate = q.getQuantityDoubleOperate();
                double doubleResult;
                doubleResult = add(doubleActual, doubleOperate);
                verifyPositive(doubleResult);
                q.setQuantityDouble(doubleResult);
            }
        }

        return q;
    }
}
