package Services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import DTO.CibilRequest;
import DTO.CibilResponse;
import Entity.CreditProfile;
import Repository.CreditScoreRepository;

@Service
public class CreditScoreService {
	private final CreditScoreRepository creditScoreRepository;

	public CreditScoreService(CreditScoreRepository creditScoreRepository) {
        this.creditScoreRepository = creditScoreRepository;
    }

	public CibilResponse getCreditScore(CibilRequest request) {

		CreditProfile creditProfile = creditScoreRepository.findByApplicationId(request.getApplicationId()).get();

		if (creditProfile != null) {

			return new CibilResponse(creditProfile.getApplicationId(), creditProfile.getPan(), creditProfile.getCreditScore(),
					creditProfile.getCreditBand());
		}

		int creditScore = calculateCreditScore(request.getPan());

		String creditBand = determineCreditBand(creditScore);

		creditProfile = new CreditProfile(request.getApplicationId(), request.getPan(), creditScore, creditBand,
				LocalDateTime.now());

		creditScoreRepository.save(creditProfile);

		return new CibilResponse(request.getApplicationId(), request.getPan(), creditScore, creditBand);
	}

	private int calculateCreditScore(String pan) {

		/*
		 * Mock implementation. random number between 300 and 850
		 */
		return (int) (Math.random() * (850 - 300 + 1)) + 300;
	}

	private String determineCreditBand(int score) {

		if (score >= 750) {
			return "EXCELLENT";
		}

		if (score >= 700) {
			return "GOOD";
		}

		if (score >= 650) {
			return "FAIR";
		}

		return "POOR";
	}
}
