package co.edu.unilibre.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LaboratoriesServiceInvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratoriesServiceInvoiceApplication.class, args);
	}

}
