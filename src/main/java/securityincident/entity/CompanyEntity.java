package securityincident.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyId")
    private Integer companyId;
    private String companyName;
    private String headOffice;
    private Integer foundedYear;
    private String createdAt;
    private String industryIdName;
    private Integer incidentCount;
    private String lastDate;

    @ManyToOne
    @JoinColumn(name="industryId")
    private IndustryEntity industryEntity;
}
