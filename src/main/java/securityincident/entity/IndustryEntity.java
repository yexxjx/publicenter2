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
    @Column(nullable = false , length = 50)
    private String industryName;
}
