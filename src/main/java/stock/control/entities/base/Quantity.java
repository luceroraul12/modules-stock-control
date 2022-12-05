package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import stock.control.enums.KindOfQuantity;

@Getter
@Setter
@MappedSuperclass
public class Quantity extends Identificable {
    @Column(name = "kind-of-quantity")
    private KindOfQuantity kindOfQuantity;
    @Column(name = "integer")
    private Integer integer;
    @Column(name = "decimal")
    private Integer decimal;

    public Quantity(KindOfQuantity kindOfQuantity) {
        this.kindOfQuantity = kindOfQuantity;
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
