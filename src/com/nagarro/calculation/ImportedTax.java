package com.nagarro.calculation;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Imported Tax Class
 * 
 *  In this class the imported tax calculation is done
 * */
import com.nagarro.model.Item;

import com.nagarro.model.*;

public class ImportedTax extends Item{
	//constructor
	public ImportedTax(String itemName, Double itemPrice, int itemQuantity ,String itemType) {
		super(itemName, itemPrice, itemQuantity, itemType);
	}
	
	@Override
	//Calculation of Sales tax Liability
	public void calculate_sales_tax_liability() {
		salesTaxLiability = ConstantValues.IMPORT_DUTY_IMPORTED* itemPrice ;
		finalPricePerItem = itemPrice + salesTaxLiability ;
		
		//conditional statement for final Price of Item
		if (finalPricePerItem<=100)
		{
			salesTaxLiability += 5 ;
			finalPricePerItem+=5 ;
		}
		else if (finalPricePerItem<=200)
		{
			salesTaxLiability += 10 ;
			finalPricePerItem+=10 ;
		}
		else
		{
			finalPricePerItem = 1.05 * finalPricePerItem ;
			salesTaxLiability = finalPricePerItem - itemPrice ;
		}
		
	}
}
