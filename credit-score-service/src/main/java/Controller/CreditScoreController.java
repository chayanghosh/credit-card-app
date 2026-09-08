package Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DTO.CibilRequest;
import DTO.CibilResponse;
import Services.CreditScoreService;

@RestController
public class CreditScoreController {
	CreditScoreService creditScoreService;
	public CreditScoreController(CreditScoreService creditScoreService) {
		this.creditScoreService = creditScoreService;
	}
	
	@PostMapping
	public CibilResponse getCreditScore(@RequestBody CibilRequest cibilRequest) {
		return creditScoreService.getCreditScore(cibilRequest);
	}
}
