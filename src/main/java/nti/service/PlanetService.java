package nti.service;


import nti.dto.lord.CreateLordDTO;
import nti.dto.planet.CreatePlanetDTO;

public interface PlanetService {
    String createPlanet(CreatePlanetDTO createPlanetDTO);
    String deletePlanet(Integer id);
}
