package securityincident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import securityincident.entity.CompanyEntity;
import securityincident.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    // 기업 수정
    @PutMapping
    public boolean 수정(@RequestBody CompanyEntity companyEntity){
        boolean result=companyService.수정(companyEntity);
        return result;
    }

    // 기업 삭제
    @DeleteMapping
    public boolean 삭제(@RequestParam int companyId){
        boolean result=companyService.삭제(companyId);
        return result;
    }

}
