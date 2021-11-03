package nti.service.impl;

import nti.dto.planet.CreatePlanetDTO;
import nti.dto.planet.EditPlanetLordIdDTO;
import nti.entity.Lord;
import nti.entity.Planet;
import nti.repository.LordRepository;
import nti.repository.PlanetRepository;
import nti.service.PlanetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JpaPlanetService implements PlanetService {
    private final PlanetRepository planetRepository;
    private final LordRepository lordRepository;

    public JpaPlanetService(PlanetRepository planetRepository, LordRepository lordRepository) {
        this.planetRepository = planetRepository;
        this.lordRepository = lordRepository;
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

    @Override
    @Transactional
    public String editPlanetLordId(EditPlanetLordIdDTO editPlanetLordIdDTO) {
        Lord lord = lordRepository.findById(editPlanetLordIdDTO.getLordId()).orElseThrow();
        Planet planet = planetRepository.findById(editPlanetLordIdDTO.getPlanetId()).orElseThrow();

        planet.setLordId(lord.getId());
        planetRepository.saveAndFlush(planet);

        return "Lord has been successfully set!";
    }
}
