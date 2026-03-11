package securityincident.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "company")
public class CompanyEntity extends BaseTime{
    @Id @Column(name = "companyId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;
    @Column(name = "companyName", length = 100, nullable = false)
    private String companyName;
    @Column(name = "headOffice" , length = 100)
    private String headOffice;
    @Column(name = "foundedYear")
    private Integer foundedYear;

    @Column(name = "industryIdName")
    private String industryIdName;
    @Column(name = "incidentCount")
    private Integer incidentCount;

    @ManyToOne(  fetch = FetchType.LAZY)
    @JoinColumn(name="industryId", nullable = true)
    private IndustryEntity industryEntity;
}
