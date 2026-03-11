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
@Entity @Table(name = "incident")
public class IncidentEntity {
    private int incidentId;
    private String incidentYear;
    private String incidentDate;
    private String incidentType;
    private String incidentDescription;
    private String actionTaken;
    private String approvalStatus;
    private String approvalTime;

    @ManyToOne
    @JoinColumn(name="companyId")
    private CompanyEntity companyEntity;

    @ManyToOne
    @JoinColumn(name="industryID")
    private IndustryEntity industryEntity;
}
