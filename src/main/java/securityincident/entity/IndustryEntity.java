package securityincident.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Builder
@Entity @Table(name = "industry" )
public class IndustryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer industryId;
    private String industryName;
}
