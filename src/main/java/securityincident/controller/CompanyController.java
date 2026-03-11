package securityincident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import securityincident.entity.CompanyEntity;
import securityincident.repository.CompanyRepository;
import securityincident.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    // 기업 전체 조회
    @GetMapping
    public List<CompanyEntity> companayFindAll(){
        return companyService.companayFindAll();
    }

    // 기업 등록
    @PostMapping
    public boolean companyAdd(@RequestBody CompanyEntity companyEntity){
        return companyService.companyAdd(companyEntity);
    }

}