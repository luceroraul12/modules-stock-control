package stock.control.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
public abstract class Product<KindOfQuantity> {
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



    //getter setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return this.dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
