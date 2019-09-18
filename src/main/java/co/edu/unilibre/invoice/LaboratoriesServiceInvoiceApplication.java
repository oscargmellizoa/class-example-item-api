package co.edu.unilibre.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "product-service")
@SpringBootApplication
@EnableFeignClients
public class LaboratoriesServiceInvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratoriesServiceInvoiceApplication.class, args);
	}

}
