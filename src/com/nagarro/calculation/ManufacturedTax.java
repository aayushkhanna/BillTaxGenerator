package com.nagarro.calculation;
/*
* @Aayush Khanna
* Trainee Technology
* 
* Manufactured Tax Class
* 
*  In this class the manufactured sales tax calculation is done
* */

import com.nagarro.model.ConstantValues;
import com.nagarro.model.Item;

public class ManufacturedTax extends Item {
	//constructor
	public ManufacturedTax(String itemName, Double itemPrice, int itemQuantity ,String itemType) {
		super(itemName, itemPrice, itemQuantity, itemType);
	}
	
	@Override
	//Calculation of Sales tax Liability
	public void calculate_sales_tax_liability() {
		salesTaxLiability = ConstantValues.TAX_RATE_MANUFACTURED* itemPrice + (1+ConstantValues.TAX_RATE_MANUFACTURED) * itemPrice * ConstantValues.SURCHAGE_RATE_MANUFACTURED; 
		finalPricePerItem = itemPrice + salesTaxLiability ;
		
	}
}

