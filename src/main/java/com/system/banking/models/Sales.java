package com.system.banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sales {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String date;
	public String name;
	private String invoice;
	private String supplier;
	private int quantity;
	private long price;
	private long amount;
	
	
	public Sales() {
		
	}
	
	public Sales(long id, String date, String name, String invoice, String supplier, int quantity, long price,
			long amount) {
		super();
		Id = id;
		this.date = date;
		this.name = name;
		this.invoice = invoice;
		this.supplier = supplier;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
}
