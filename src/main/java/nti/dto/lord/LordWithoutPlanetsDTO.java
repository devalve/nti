package nti.dto.lord;

import lombok.Getter;

@Getter
public class LordWithoutPlanetsDTO {
    private final Integer id;
    private final String name;
    private final Integer age;

    public LordWithoutPlanetsDTO(Integer id,
                                 String name,
                                 Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
