package securityincident.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securityincident.entity.IndustryEntity;

@Repository
public interface IndustryRepository extends JpaRepository<IndustryEntity, Integer> {
}
