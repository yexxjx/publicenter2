package securityincident.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "industry" )
public class IndustryEntity {
    private int industryId;
    private String industryName;
}
