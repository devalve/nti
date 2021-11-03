package nti.service.impl;

import nti.dto.lord.CreateLordDTO;
import nti.dto.lord.LordWithoutPlanetsDTO;
import nti.entity.Lord;
import nti.repository.LordRepository;
import nti.service.LordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class JpaLordService implements LordService {
    private final LordRepository lordRepository;

    public JpaLordService(LordRepository lordRepository) {
        this.lordRepository = lordRepository;
    }

    @Override
    @Transactional
    public String createLord(CreateLordDTO createLordDTO) {
        lordRepository.saveAndFlush(new Lord(createLordDTO.getName(), createLordDTO.getAge()));
        return "Lord has been successfully created!";
    }

    @Override
    @Transactional
    public Set<LordWithoutPlanetsDTO> getAllLordsWithoutPlanets() {
        return lordRepository.findByPlanetsNull();
    }

    @Override
    public Set<LordWithoutPlanetsDTO> getTopTenMinAges() {
        return lordRepository.findTop10ByOrderByAge();
    }
}
