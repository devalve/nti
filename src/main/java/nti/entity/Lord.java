package nti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Lord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lord_id_seq_generator")
    @SequenceGenerator(name = "lord_id_seq_generator", sequenceName = "lord_id_seq", allocationSize = 1)
    private Integer id;

    private String name;

    private Integer age;

    @OneToMany(mappedBy = "lord")
    Set<Planet> planets;

    public Lord(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Lord() {

    }
}
