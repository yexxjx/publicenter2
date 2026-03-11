package securityincident.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import securityincident.entity.CompanyEntity;
import securityincident.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            list.setIncidentCount(companyEntity.getIncidentCount());
            if (companyEntity.getIndustryEntity() != null) {
                list.setIndustryIdName(companyEntity.getIndustryEntity().getIndustryName());
            } else {
                list.setIndustryIdName("산업군 미지정");
            }
            companyEntities.add(list);
        }); return companyEntities;
    }

    // 기업 등록
    public boolean companyAdd( CompanyEntity companyEntity){
        return companyRepository.save(companyEntity).getCompanyId()>=1;
    }

    // 기업 수정
    public boolean companyUpdate(CompanyEntity companyEntity){
        Optional<CompanyEntity> optional=companyRepository.findById(companyEntity.getCompanyId());
        if(optional.isPresent()){
            CompanyEntity updateEntity=optional.get();
            updateEntity.setCompanyId(companyEntity.getCompanyId());
            updateEntity.setCompanyName(companyEntity.getCompanyName());
            updateEntity.setHeadOffice(companyEntity.getHeadOffice());
            updateEntity.setFoundedYear(companyEntity.getFoundedYear());
        }
        return true;
    }

    // 기업 삭제
    public boolean companyDelete(int companyId){
        companyRepository.deleteById(companyId);
        return true;
    }


}
