package securityincident.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "company")
public class CompanyEntity {
    private int companyId;
    private String companyName;
    private String headOffice;
    private int foundedYear;
    private String createdAt;
    private String industryIdName;
    private int incidentCount;
    private String lastDate;

    @ManyToOne
    @JoinColumn(name="industryId")
    private IndustryEntity industryEntity;
}
