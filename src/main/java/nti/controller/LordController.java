package nti.controller;

import nti.dto.lord.CreateLordDTO;
import nti.service.LordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
