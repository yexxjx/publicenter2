package securityincident.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "incident")
public class IncidentEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer incidentId;
    @Column( columnDefinition = "CHAR(4)")
    private String incidentYear;
    @Column(length = 50)
    private String incidentType;
    @Column( columnDefinition = "TEXT")
    private String incidentDescription;
    @Column( columnDefinition = "TEXT")
    private String actionTaken;
    @Column(length = 10)
    private String approvalStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="companyId")
    private CompanyEntity companyEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="industryId")
    private IndustryEntity industryEntity;
}
