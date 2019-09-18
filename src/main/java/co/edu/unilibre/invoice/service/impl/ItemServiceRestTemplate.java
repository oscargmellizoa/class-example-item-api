package co.edu.unilibre.invoice.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.unilibre.invoice.model.Item;
import co.edu.unilibre.invoice.model.Product;
import co.edu.unilibre.invoice.service.IItemService;

@Service("itemServiceRestTemplate")
public class ItemServiceRestTemplate implements IItemService{
	@Autowired
	private RestTemplate clientRest;
	
	public List<Item> getAll(){
		List<Product> products = Arrays.asList(clientRest.getForObject("http://localhost:10080/list", Product[].class));
		return products.stream().map(prod -> new Item(prod, 1)).collect(Collectors.toList());
	}
	
	public Item findById(Long id, Integer quantity) {
		Map<String, String> pathVariable = new HashMap<>();
		pathVariable.put("id", id.toString());
		Product product = clientRest.getForObject("http://localhost:10080/{id}", Product.class, pathVariable);
		return new Item(product, quantity);
	}
}
