package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import stock.control.enums.KindOfQuantity;

@Getter
@Setter
@Builder
@MappedSuperclass
public class Quantity extends Identificable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "kind-of-quantity")
    private KindOfQuantity kindOfQuantity;
    @Column(name = "q-integer")
    private Integer quantityInteger;
    @Column(name = "q-double")
    private Double quantityDouble;

    private Integer quantityIntegerOperate;
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
