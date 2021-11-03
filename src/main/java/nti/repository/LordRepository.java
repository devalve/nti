package nti.repository;

import nti.entity.Lord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LordRepository extends JpaRepository<Lord, Integer> {
}
