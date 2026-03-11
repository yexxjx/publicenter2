package securityincident.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import securityincident.entity.CompanyEntity;
import securityincident.repository.CompanyRepository;

@Service
@Transactional
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    // 기업 수정
    public boolean 수정(CompanyEntity companyEntity){}

    // 기업 삭제
    public boolean 삭제(int companyId){
        companyRepository.deleteById(companyId);
        return true;
    }


}
