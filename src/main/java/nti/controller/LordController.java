package nti.controller;

import nti.dto.lord.CreateLordDTO;
import nti.dto.lord.LordWithoutPlanetsDTO;
import nti.entity.Lord;
import nti.service.LordService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/lord")
public class LordController {

    private final LordService lordService;

    public LordController(LordService lordService) {
        this.lordService = lordService;
    }

    @PostMapping
    public String createLord(@RequestBody CreateLordDTO createLordDTO) {
        return lordService.createLord(createLordDTO);
    }

    @GetMapping("/empty")
    public Set<LordWithoutPlanetsDTO> getAllWithoutPlanets(){
        return lordService.getAllLordsWithoutPlanets();
    }
}
