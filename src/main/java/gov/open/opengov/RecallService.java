package gov.open.opengov;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RecallService {

	private final RestTemplate restTemplate;

	public RecallService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
    
	public Recall[] fetchRecalls(String recallDateStart) {
		
		return this.restTemplate.getForObject("https://www.saferproducts.gov/RestWebServices/Recall?format=json&RecallDateStart={recallStartDate}",Recall[].class,recallDateStart);
	}

}