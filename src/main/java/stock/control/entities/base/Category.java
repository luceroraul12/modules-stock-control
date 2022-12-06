package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends Identificable{
    @Column(name = "category")
    private String name;
}
