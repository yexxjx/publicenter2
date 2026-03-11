package securityincident.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securityincident.entity.IncidentEntity;

@Repository
public interface IncidentRepository extends JpaRepository<IncidentEntity, Integer> {
}
