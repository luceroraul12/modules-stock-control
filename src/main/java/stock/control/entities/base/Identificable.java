package stock.control.entities.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class Identificable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "date-created")
    private LocalDateTime dateCreated;
    @Column(name = "date-modified")
    private LocalDateTime dateModified;
}
