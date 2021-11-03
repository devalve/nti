package nti.service;


import nti.dto.lord.CreateLordDTO;
import nti.dto.lord.LordWithoutPlanetsDTO;
import nti.entity.Lord;

import java.util.Set;

public interface LordService {
    String createLord(CreateLordDTO createLordDTO);
    Set<LordWithoutPlanetsDTO> getAllLordsWithoutPlanets();
    Set<LordWithoutPlanetsDTO> getTopTenMinAges();
}
