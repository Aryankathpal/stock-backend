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

import com.system.banking.models.Supplier;
import com.system.banking.repo.SupplierRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SupplierController {

	@Autowired
	private SupplierRepository repository;
	
	@GetMapping("supplier/{id}")
	public Supplier getItems(@PathVariable long id) {
		Optional<Supplier> person = repository.findById(id);
		if(person.isEmpty()) {
			throw new RuntimeException("not found");
		}
		return person.get();
	}
	@GetMapping("suppliers")
	public List<Supplier> getallItems(){
		return repository.findAll();
	}
	
	@PostMapping("add-supplier")
	public void addItem(@RequestBody Supplier item) {
		repository.save(item);
	}
	@PutMapping("update-supplier/{id}")
	public void updateItem(@PathVariable long id,@RequestBody Supplier item) {
		repository.save(item);
	}
	@DeleteMapping("delete-supplier/{id}")
	public void deleteItem(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
	
}
