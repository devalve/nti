package nti.repository;

import nti.entity.Lord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LordRepository extends JpaRepository<Lord, Integer> {
}
