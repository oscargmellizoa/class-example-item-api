package co.edu.unilibre.invoice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.invoice.model.Product;

@FeignClient(name = "product-service", url = "localhost:10010")
public interface ProductServiceClientFeign {
	
	@GetMapping("/list")
	public List<Product> getList();
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id);
}
