package guru.springframework.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @OneToOne(fetch = FetchType.EAGER)
    private UnitMeasure um;
    @ManyToOne
    private Recipe recipe;


    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitMeasure um) {
        this.description = description;
        this.amount = amount;
        this.um = um;
    }

    public Ingredient(String description, BigDecimal amount, UnitMeasure um, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.um = um;
        this.recipe = recipe;
    }

}
