package securityincident.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securityincident.entity.CompanyEntity;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Integer> {
}
