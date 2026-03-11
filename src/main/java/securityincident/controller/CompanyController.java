package securityincident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import securityincident.entity.CompanyEntity;
import securityincident.service.CompanyService;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    // 기업 전체 조회
    @GetMapping
    public List<CompanyEntity> companyFindAll(){
        return companyService.companyFindAll();
    }

    // 기업 등록 { "companyName": "새로운 기업", "headOffice": "서울", "foundedYear": 2024, "industryIdName": "IT", "incidentCount": 0 }
    @PostMapping
    public boolean companyAdd(@RequestBody CompanyEntity companyEntity){
        return companyService.companyAdd(companyEntity);
    }

    // 기업 수정
    @PutMapping
    public boolean companyUpdate(@RequestBody CompanyEntity companyEntity){
        boolean result=companyService.companyUpdate(companyEntity);
        return result;
    }

    // 기업 삭제
    @DeleteMapping
    public boolean companyDelete(@RequestParam int companyId){
        boolean result=companyService.companyDelete(companyId);
        return result;
    }

}
