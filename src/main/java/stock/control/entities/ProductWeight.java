package stock.control.entities;

import jakarta.persistence.Column;

public class ProductWeight extends Product{
    @Column(name = "weight")
    private Double weight;
}
