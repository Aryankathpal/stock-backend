package com.system.banking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.banking.models.Stocks;
import com.system.banking.repo.StockRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StocksController {
	@Autowired 
	private StockRepository repository;
	
	@GetMapping("item/{id}")
	public Stocks getItems(@PathVariable long id) {
		Optional<Stocks> item = repository.findById(id);
		if(item.isEmpty()) {
			throw new RuntimeException("not found");
		}
		return item.get();
	}
	@GetMapping("items")
	public List<Stocks> getallItems(){
		return repository.findAll();
	}
	
	@PostMapping("add-stock")
	public void addItem(@RequestBody Stocks item) {
		repository.save(item);
	}
	@PutMapping("update-item/{id}")
	public void updateItem(@PathVariable long id,@RequestBody Stocks item) {
		repository.save(item);
	}
	@DeleteMapping("delete-item/{id}")
	public void deleteItem(@PathVariable long id) {
		repository.deleteById(id);
	}
}
