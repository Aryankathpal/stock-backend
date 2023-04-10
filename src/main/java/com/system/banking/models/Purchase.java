package com.system.banking.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
public class Purchase {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String date;
	private String name;
	private int quantity;
	private String supplier;
	private int price;
	private int total;
	
	public Purchase() {
		
	}
	public Purchase(int id, String date, String name, int quantity, String supplier, int price, int total) {
		super();
		this.Id = id;
		this.date = date;
		this.name = name;
		this.quantity = quantity;
		this.supplier = supplier;
		this.price = price;
		this.total = total;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
