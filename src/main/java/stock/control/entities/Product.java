package stock.control.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


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
