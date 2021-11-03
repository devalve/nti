package nti.controller;

import nti.dto.planet.CreatePlanetDTO;
import nti.service.PlanetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planet")
public class PlanetController {
    private final PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @PostMapping
    public String createPlanet(@RequestBody CreatePlanetDTO createPlanetDTO) {
        return planetService.createPlanet(createPlanetDTO);
    }

    @DeleteMapping
    public String deletePlanet(@RequestBody Integer id) {
        return planetService.deletePlanet(id);
    }
}
