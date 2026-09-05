package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.CreditScoreEntity;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScoreEntity, String>{
    Optional<CreditScoreEntity> findByApplicationId(String applicationId);
}
