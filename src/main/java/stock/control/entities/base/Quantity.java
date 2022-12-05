package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import stock.control.enums.KindOfQuantity;

@Getter
@Setter
public class Quantity extends Identificable {
    private KindOfQuantity kindOfQuantity;
    private Integer integer;
    private Integer decimal;

    public Quantity(Integer integer) {
        this.integer = integer;
        this.kindOfQuantity = KindOfQuantity.UNIT;
    }

    public Quantity(Integer integer, Integer decimal) {
        this.integer = integer;
        this.decimal = decimal;
        this.kindOfQuantity = KindOfQuantity.WHEIGHT;
    }

    public boolean isMinorOrEqualThanQuantityStocked(Number quantity){
        boolean result = false;

        switch (kindOfQuantity){
            case UNIT -> result = this.integer >= (int) quantity;
            case WHEIGHT -> result = generateDouble() >= (double)quantity;
        }
        return result;
    }

    private Double generateDouble(){
        return Double.parseDouble(integer+"."+decimal);
    }
}
