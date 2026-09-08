package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.CreditProfile;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditProfile, String>{
    Optional<CreditProfile> findByApplicationId(String applicationId);
}
