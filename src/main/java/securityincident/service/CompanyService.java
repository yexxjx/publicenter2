package securityincident.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import securityincident.entity.CompanyEntity;
import securityincident.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompanyService {
    @Autowired private CompanyRepository companyRepository;

    // 기업 전체 조회
    public List<CompanyEntity> companyFindAll(){
        List<CompanyEntity> companyEntityList = companyRepository.findAll();
        List<CompanyEntity> companyEntities = new ArrayList<>();
        companyEntityList.forEach(companyEntity -> {
            CompanyEntity list = new CompanyEntity();
            list.setCompanyId(companyEntity.getCompanyId());
            list.setHeadOffice(companyEntity.getHeadOffice());
            list.setCompanyName(companyEntity.getCompanyName());
            list.setFoundedYear(companyEntity.getFoundedYear());
            list.setIndustryIdName(companyEntity.getIndustryEntity().getIndustryName());
            list.setIncidentCount(companyEntity.getIncidentCount());
            companyEntities.add(list);
        }); return companyEntities;
    }

    // 기업 등록
    public boolean companyAdd( CompanyEntity companyEntity){
        return companyRepository.save(companyEntity).getCompanyId()>=1;
    }

    // 기업 수정
    public boolean companyUpdate(CompanyEntity companyEntity){
        return true;
    }

    // 기업 삭제
    public boolean companyDelete(int companyId){
        companyRepository.deleteById(companyId);
        return true;
    }


}
