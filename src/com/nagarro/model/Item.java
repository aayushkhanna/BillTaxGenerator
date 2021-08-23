package com.nagarro.model;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Item Class
 * 
 *  This class contains all the getters and setters method
 * */
public abstract class Item {
	//Declaration of variables
	protected String itemName ;
	protected double itemPrice ;
	protected int itemQuantity ;
	protected String itemType ;
	protected double salesTaxLiability ;
	protected double finalPricePerItem ;
	protected double totalPrice ;
	
	//super class constructor
	public Item(String itemName, double itemPrice, int itemQuantity, String itemType) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		this.itemType = itemType;
	}
	
	//abstract method for sales tax calculation
	public abstract void calculate_sales_tax_liability() ;
	
	//Get method for item Name
	public String getItemName() {
		return itemName;
	}
	
	//Set method for Item Name
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	//Get method for Item Price
	public double getItemPrice() {
		return itemPrice;
	}
	
	//Set method for item Price
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	//Get method for item Quantity
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	//set method for item quantity
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	//get method for item type
	public String getItemType() {
		return itemType;
	}
	
	//set method for item type
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	//get method for sales tax liability
	public double getSalesTaxLiability() {
		return salesTaxLiability;
	}
	
	//get method for final price per item
	public double getFinalPricePerItem() {
		return finalPricePerItem;
	}
	
	//get method for total price
	public double getTotalPrice() {
		return totalPrice;
	}
	
	//set method for total price
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
