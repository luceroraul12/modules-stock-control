package stock.control.entities.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Subcateogry extends Identificable {
    @Column(name = "subcategory")
    private String name;
}
