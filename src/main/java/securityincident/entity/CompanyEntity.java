package securityincident.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

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
    @Column(name = "createdAt")
    private CreatedDate createdAt;

    @Column(name = "industryIdName")
    private String industryIdName;
    @Column(name = "incidentCount")
    private Integer incidentCount;
    @Column(name = "lastDate")
    private String lastDate;

    @ManyToOne
    @JoinColumn(name="industryId")
    private IndustryEntity industryEntity;
}
