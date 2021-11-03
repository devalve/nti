package nti.service;


import nti.dto.lord.LordWithMinAgeDTO;
import nti.dto.lord.crud.CreateLordDTO;
import nti.dto.lord.LordWithoutPlanetsDTO;

import java.util.Set;

public interface LordService {
    String createLord(CreateLordDTO createLordDTO);
    Set<LordWithoutPlanetsDTO> getAllLordsWithoutPlanets();
    Set<LordWithMinAgeDTO> getTopTenMinAges();
}
