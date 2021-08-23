package com.nagarro.calculation;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Raw Tax Class
 * 
 *  In this class the raw tax calculation is done
 * */
import com.nagarro.model.ConstantValues;
import com.nagarro.model.Item;

public class RawTax extends Item{
	//constructor
	public RawTax(String itemName, Double itemPrice, int itemQuantity ,String itemType) {
		super(itemName, itemPrice, itemQuantity, itemType);
	}

	@Override
	//Calculation of Sales tax Liability
	public void calculate_sales_tax_liability() {
	{
		salesTaxLiability = ConstantValues.TAX_RATE_RAW * itemPrice ; 
		finalPricePerItem = itemPrice + salesTaxLiability ;
		totalPrice = finalPricePerItem * itemQuantity;
		
	}
}

}
