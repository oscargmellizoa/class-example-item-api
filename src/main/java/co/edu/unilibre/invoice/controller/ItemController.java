package co.edu.unilibre.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.invoice.model.Item;
import co.edu.unilibre.invoice.service.IItemService;

@RestController
public class ItemController {
	
	@Autowired(required = true)
	@Qualifier("itemServiceRestTemplate")
	private IItemService itemService;
	
	@GetMapping("/list")
	public List<Item> getAll(){
		return itemService.getAll();
	}
	
	@GetMapping("/{id}/{quantity}")
	public Item getById(@PathVariable Long id, @PathVariable Integer quantity) {
		return itemService.findById(id, quantity);
	}
}
