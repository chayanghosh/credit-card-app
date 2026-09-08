package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CibilResponse {
	private String applicationId;
    private String pan;
    private Integer creditScore;
    private String creditBand;
}
