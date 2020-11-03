package guru.springframework.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UnitMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
