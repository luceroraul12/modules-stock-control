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

}
