package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Product extends Identificable {
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @Column(name = "date_modified")
    private LocalDateTime dateModified;

    @Column(name = "quantity")
    protected Quantity quantity;

    //public methods
    public boolean isSelleable(Number quantity){
        return this.quantity.isMinorOrEqualThanQuantityStocked(quantity);
    };

}
