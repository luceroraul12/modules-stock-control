package stock.control.entities;

import jakarta.persistence.Column;

public class ProductUnit extends Product{
    @Column(name = "unit")
    private Integer unit;
}
