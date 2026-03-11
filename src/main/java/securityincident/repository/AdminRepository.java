package securityincident.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securityincident.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
}
