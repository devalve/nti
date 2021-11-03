package nti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planet_id_seq_generator")
    @SequenceGenerator(name = "planet_id_seq_generator", sequenceName = "planet_id_seq", allocationSize = 1)
    private Integer id;

    private String title;

    public Planet() {
    }

    public Planet(String title) {
        this.title = title;
    }
}
