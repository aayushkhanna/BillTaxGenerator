package com.nagarro.output;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Result Class
 * 
 *  In this class results are displayed
 * */
import com.nagarro.model.Item;

public class Result {
	
	//Function for displaying result 
	public static void displayResult(Item item)
	{
		String string = String.format("%-14s%-15.3f%-18.3f%-25.3f%-7d%-15.3f", item.getItemName(),item.getItemPrice(),item.getSalesTaxLiability(),item.getFinalPricePerItem(),item.getItemQuantity(),item.getTotalPrice());
		System.out.println(string);
	}

	//Format to display result
	public static void displayResultFormat() {
		System.out.println("\n\n\nOutput:");
		String str = String.format("%-14s%-15s%-18s%-25s%-7s%-15s", "Name","Price","tax liability","Final Price per Item","Qty","Total Price");
		System.out.println(str);
		//System.out.println("Name"+"  "+"Price"+"  "+"tax liability"+"   "+"Final Price per Item"+"  "+"Total Price");
	}
}

