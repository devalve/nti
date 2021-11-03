package nti.service.impl;

import nti.dto.planet.CreatePlanetDTO;
import nti.entity.Planet;
import nti.repository.PlanetRepository;
import nti.service.PlanetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JpaPlanetService implements PlanetService {
    private final PlanetRepository planetRepository;

    public JpaPlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    @Transactional
    public String createPlanet(CreatePlanetDTO createPlanetDTO) {
        planetRepository.saveAndFlush(new Planet(createPlanetDTO.getTitle()));
        return "Planet has been successfully created!";
    }

    @Override
    @Transactional
    public String deletePlanet(Integer id) {
        Planet planet = planetRepository.findById(id).orElseThrow();
        planetRepository.delete(planet);
        return "Planet has been successfully deleted!";
    }
}
