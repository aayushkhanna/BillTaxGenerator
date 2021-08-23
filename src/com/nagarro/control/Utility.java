package com.nagarro.control;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Raw Tax Class
 * 
 *  In this class user inputs are saved into array list for further calculation of results
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nagarro.input.InputAcceptance;
import com.nagarro.model.ConstantValues;
import com.nagarro.model.Item;
import com.nagarro.output.Result;


public class Utility extends ConstantValues {
	public static void main(String[] args) throws IOException {
		
		//Creation of Array List
		ArrayList<Item> list = new ArrayList<Item>();
		
		//Declaration of Buffered Reader for user input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)) ;
		
		//Declaration of variables
		char choice ;
		Item item ;
		Double effectivePriceOfAllItems= 0.0 ;
		Double totalPrice ;
		
		/*
		 * After addition of 1 item it will ask for user input to add more items. If user denies by pressing 'n'
		 * It will generate the bill else if user press 'y' it will ask for next item and data will be stored into
		 * the array till user say no.
		 * */
		do
		{
			item = InputAcceptance.enterInput() ;
			item.calculate_sales_tax_liability() ;
			totalPrice = item.getItemQuantity()*item.getFinalPricePerItem() ;
			item.setTotalPrice(totalPrice);
			effectivePriceOfAllItems+=item.getTotalPrice() ;
			list.add(item);
			System.out.print(ADD_MORE_ITEMS_INPUT);
			choice = bufferedReader.readLine().charAt(0) ;
		}while((choice=='y')||(choice=='Y'));

		//values stored in array using for each loop for calculation of bill
		Result.displayResultFormat();
		for (Item itemArray : list) {
			Result.displayResult(itemArray);
		}
		
		//Display effective Price Of All Items after including tax.
		String string = String.format("\n%88.3f",effectivePriceOfAllItems );
		System.out.println(string);
	}
}


