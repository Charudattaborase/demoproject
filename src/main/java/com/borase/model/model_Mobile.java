package com.borase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class model_Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String company;
	private String model;
	private int quantity;
	private int price;
	private double discount;

	// Getter/ Setter OR Constructor
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public model_Mobile() {}
	public model_Mobile(long id, String company, String model, int quantity, int price, double discount) {
		this.id = id;
		this.company = company;
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.discount=discount;
	}
	

}
