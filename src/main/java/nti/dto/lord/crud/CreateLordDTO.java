package nti.dto.lord.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CreateLordDTO {
    private final String name;
    private final Integer age;

    public CreateLordDTO(@JsonProperty("name")String name,
                         @JsonProperty("age")Integer age) {
        this.name = name;
        this.age = age;
    }
}
