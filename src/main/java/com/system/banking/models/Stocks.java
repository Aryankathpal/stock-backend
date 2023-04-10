package com.system.banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stocks {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String name;
	private String supplier;
	private String date;
	private int stocks;
	
	public Stocks() {
		
	}
	
	public Stocks(long id,String name, String supplier, String date, int stocks) {
		super();
		Id=id;
		this.name = name;
		this.supplier = supplier;
		this.date = date;
		this.stocks = stocks;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	
	
}
