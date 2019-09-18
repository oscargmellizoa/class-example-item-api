package co.edu.unilibre.invoice.service;

import java.util.List;

import co.edu.unilibre.invoice.model.Item;

public interface IItemService {
	public List<Item> getAll();
	public Item findById(Long id, Integer quantity);
}
