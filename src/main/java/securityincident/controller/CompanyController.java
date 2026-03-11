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
    public List<CompanyEntity> companayFindAll(){
        return companyService.companayFindAll();
    }

    // 기업 등록
    @PostMapping
    public boolean companyAdd(@RequestBody CompanyEntity companyEntity){
        return companyService.companyAdd(companyEntity);
    }

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
