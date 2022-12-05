package stock.control.entities;

import stock.control.enums.KindOfQuantity;

public class Quantity {
    private KindOfQuantity kindOfQuantity;
    private Number quantity;

    public boolean isMinorOrEqualThanQuantityStocked(Number quantity){
        boolean result = false;

        switch (kindOfQuantity){
            case UNIT -> result = (int) this.quantity >= (int)quantity;
            case WHEIGHT -> result = (double) this.quantity >= (double)quantity;
        }

        return result;
    }

    public KindOfQuantity getKindOfQuantity() {
        return this.kindOfQuantity;
    }

    public void setKindOfQuantity(KindOfQuantity kindOfQuantity) {
        this.kindOfQuantity = kindOfQuantity;
    }

    public Number getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }
}
