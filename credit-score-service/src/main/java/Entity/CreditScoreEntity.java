package Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreditScoreEntity {
	
	@Id
    @Column(name = "application_id", nullable = false)
    private String applicationId;

    @Column(nullable = false)
    private String pan;

    @Column(name = "credit_score", nullable = false)
    private Integer creditScore;

    @Column(name = "credit_band", nullable = false)
    private String creditBand;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

	
}
