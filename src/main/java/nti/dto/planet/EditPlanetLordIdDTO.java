package nti.dto.planet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class EditPlanetLordIdDTO {
    private final Integer lordId;
    private final Integer planetId;

    public EditPlanetLordIdDTO(@JsonProperty("lordId") Integer lordId,
                               @JsonProperty("planetId")Integer planetId) {
        this.lordId = lordId;
        this.planetId = planetId;
    }
}
