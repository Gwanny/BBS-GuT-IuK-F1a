package iuk.javabackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pizza")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;
    private float preisklein;
    private float preisgross;

    public Pizza() {
    }

    public Pizza(String name, float preisKlein, float preisGross) {
        this.name = name;
        this.preisklein = preisKlein;
        this.preisgross = preisGross;
    }
}
