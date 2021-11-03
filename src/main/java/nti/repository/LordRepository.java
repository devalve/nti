package nti.repository;

import nti.dto.lord.LordWithoutPlanetsDTO;
import nti.entity.Lord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LordRepository extends JpaRepository<Lord, Integer> {
    Set<LordWithoutPlanetsDTO> findByPlanetsNull();

    Set<LordWithoutPlanetsDTO> findTop10ByOrderByAge();


}
