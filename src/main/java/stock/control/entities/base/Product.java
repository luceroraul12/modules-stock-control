package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Product extends Identificable {
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    protected Quantity quantity;

    //public methods
    public boolean isSelleable(Number quantity){
        return this.quantity.isMinorOrEqualThanQuantityStocked(quantity);
    };

}
