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

import com.system.banking.models.Purchase;
import com.system.banking.repo.DbRespository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class purchaseController {

	@Autowired 
	private DbRespository repository;
	
	@GetMapping("purchased-item/{id}")
	public Purchase getPurchase(@PathVariable long id) {
		Optional<Purchase> item = repository.findById(id);
		if(item.isEmpty()) {
			throw new RuntimeException("not found");
		}
		return item.get();
	}
	@GetMapping("purchased-items")
	public List<Purchase> getallPurchase(){
		return repository.findAll();
	}
	
	@PostMapping("add-purchase")
	public void addPurchase(@RequestBody Purchase purchase) {
		repository.save(purchase);
	}
	@PutMapping("update-purchase/{id}")
	public void updatePurchase(@PathVariable long id,@RequestBody Purchase purchase) {
		repository.save(purchase);
	}
	@DeleteMapping("delete-purchase/{id}")
	public void deletePurchase(@PathVariable long id) {
		repository.deleteById(id);
	}
}
