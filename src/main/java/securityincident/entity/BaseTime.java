package securityincident.entity;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@EntityListeners( AuditingEntityListener.class )

public class BaseTime {

    @CreatedDate // 엔티티 생성날짜 주입
    private LocalDateTime createDate;

    @LastModifiedDate // 엔티티 수정날짜 주입
    private LocalDateTime updateDate;

    // 이러케 나옴 : create_date datetime(6), 반영이 됨!! 신기하다
    // 이러케 나옴 : update_date datetime(6), 상속 관계로 엔티티 확장.
}