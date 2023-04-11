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

import com.system.banking.models.Sales;
import com.system.banking.repo.SalesRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class salesController {

	@Autowired
	private SalesRepository repository;
	
	@GetMapping("order/{id}")
	public Sales getItems(@PathVariable long id) {
		Optional<Sales> order = repository.findById(id);
		if(order.isEmpty()) {
			throw new RuntimeException("not found");
		}
		return order.get();
	}
	
	@GetMapping("orders")
	public List<Sales> getallItems(){
		return repository.findAll();
	}
	@PostMapping("add-order")
	public void addItem(@RequestBody Sales item) {
		repository.save(item);
	}
	@PutMapping("update-order/{id}")
	public void updateItem(@PathVariable long id,@RequestBody Sales item) {
		repository.save(item);
	}
	@DeleteMapping("delete-order/{id}")
	public void deleteItem(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
