package stock.control.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import stock.control.enums.KindOfQuantity;

@Entity
@Getter
@Setter
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

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
}
