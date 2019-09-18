package co.edu.unilibre.invoice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.invoice.feign.ProductServiceClientFeign;
import co.edu.unilibre.invoice.model.Item;
import co.edu.unilibre.invoice.model.Product;
import co.edu.unilibre.invoice.service.IItemService;

@Service("itemServiceFeign")
public class ItemServiceFeign implements IItemService{

	@Autowired
	private ProductServiceClientFeign productServiceClientFeign; 
	
	@Override
	public List<Item> getAll() {
		List<Product> products = productServiceClientFeign.getList();
		return products.stream().map(prod -> new Item(prod, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer quantity) {
		return new Item(productServiceClientFeign.getById(id), quantity);
	}

}
