package za.co.pokemon.api;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRemplateObject {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
