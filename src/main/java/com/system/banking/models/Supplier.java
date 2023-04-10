package com.system.banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String date;
	private String name;
	private String phone;
	private String item;
	private boolean status;
	
	Supplier(){
		
	}

	public Supplier(long id, String date, String name, String phone, String item, boolean status) {
		super();
		Id = id;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.item = item;
		this.status = status;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
