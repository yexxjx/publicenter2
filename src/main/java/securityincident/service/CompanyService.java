package securityincident.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import securityincident.entity.CompanyEntity;
import securityincident.repository.CompanyRepository;

import java.util.List;

@Service
@Transactional
public class CompanyService {
    @Autowired private CompanyRepository companyRepository;

    // 기업 전체 조회
    public List<CompanyEntity> companayFindAll(){
        return companyRepository.findAll();
    }

    // 기업 등록
    public boolean companyAdd( CompanyEntity companyEntity){
        return companyRepository.save(companyEntity).getCompanyId()>=1;
    }
}
