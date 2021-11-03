package nti.dto.planet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CreatePlanetDTO {
    private final String title;

    public CreatePlanetDTO(@JsonProperty("title") String title) {
        this.title = title;
    }
}
