package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Identificable {
    @Column(name = "date-created")
    private LocalDateTime dateCreated;
    @Column(name = "date-modified")
    private LocalDateTime dateModified;

}
