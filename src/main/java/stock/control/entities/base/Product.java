package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Product extends Identificable {
    @Column(name = "name")
    private String name;
}
