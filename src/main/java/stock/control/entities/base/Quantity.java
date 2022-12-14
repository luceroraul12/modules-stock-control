package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.boot.jackson.JsonComponent;
import stock.control.enums.KindOfQuantity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Quantity extends Identificable {
    @Column(name = "kind-of-quantity")
    private KindOfQuantity kindOfQuantity;
    @Column(name = "q-integer")
    private Integer quantityInteger;
    @Column(name = "q-double")
    private Double quantityDouble;

    @Transient
    private Integer quantityIntegerOperate;
    @Transient
    private Double quantityDoubleOperate;

    public boolean isMinorOrEqualThanQuantityStocked(Number quantity){
        boolean result = false;

        switch (kindOfQuantity){
            case UNIT -> result = this.quantityInteger >= (int) quantity;
            case WHEIGHT -> result = this.quantityDouble >= (double)quantity;
        }
        return result;
    }
}
