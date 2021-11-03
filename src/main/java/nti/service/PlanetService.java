package nti.service;


import nti.dto.lord.CreateLordDTO;
import nti.dto.planet.CreatePlanetDTO;
import nti.dto.planet.EditPlanetLordIdDTO;
import nti.entity.Lord;

import java.util.Set;

public interface PlanetService {
    String createPlanet(CreatePlanetDTO createPlanetDTO);
    String deletePlanet(Integer id);
    String editPlanetLordId(EditPlanetLordIdDTO editPlanetLordIdDTO);
}
