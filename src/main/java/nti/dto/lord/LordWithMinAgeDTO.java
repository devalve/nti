package nti.dto.lord;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class LordWithMinAgeDTO {
    private final Integer id;
    private final String name;
    private final Integer age;

    public LordWithMinAgeDTO(@JsonProperty("id")Integer id,
                             @JsonProperty("name") String name,
                             @JsonProperty("age") Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
