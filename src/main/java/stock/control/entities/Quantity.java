package stock.control.entities;

import stock.control.enums.KindOfQuantity;

public class Quantity {
    private KindOfQuantity kindOfQuantity;
    private Number quantity;

    public boolean isMinorThanQuantityStocked(Number quantity){
        boolean result = false;

        switch (kindOfQuantity){
            case UNIT -> result = (int) this.quantity > (int)quantity;
            case WHEIGHT -> result = (double) this.quantity > (double)quantity;
        }

        return result;
    }
}
