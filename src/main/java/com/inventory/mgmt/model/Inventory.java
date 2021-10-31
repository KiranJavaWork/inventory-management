package com.inventory.mgmt.model;

import com.opencsv.bean.CsvBindByName;

public class Inventory {

	@CsvBindByName(column = "Category")
	private String category;
	
	@CsvBindByName(column = "Item")
	private String item;
	
	@CsvBindByName(column = "Quantity")
	private int quantity;
	
	@CsvBindByName(column = "Price/ Piece")
	private double price;

	public Inventory(String category, String item, int quantity, double price) {
		super();
		this.category = category;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public Inventory() {
		super();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inventory [category=" + category + ", item=" + item + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}
