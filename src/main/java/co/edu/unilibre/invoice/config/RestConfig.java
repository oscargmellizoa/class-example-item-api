package co.edu.unilibre.invoice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
	
	@Bean("clientRest")
	@LoadBalanced
	public RestTemplate registryRestTemplate() {
		return new RestTemplate();
	}
}
