package Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditProfile {
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
