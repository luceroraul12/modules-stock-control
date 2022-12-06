package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Category extends Identificable{
    @Column(name = "name")
    private String name;
}
