package com.nagarro.input;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Input Validation Class
 * 
 *  In this class user inputs are are being validated
 * */
import com.nagarro.model.ConstantValues;

public class InputValidation extends ConstantValues {
	
	//Validate Item Price
	public static boolean checkItemPrice(String string) {
		try {
			Double.parseDouble(string) ;
		}
		catch (NumberFormatException e) {
			System.err.print(ITEM_PRICE_VALIDATION_ERROR);
			return false ;
		}
		return true ;
	}

	//Validate Item Type
	public static boolean checkItemType(String string) {
		if (string.equalsIgnoreCase(ConstantValues.RAW_TAX)|string.equalsIgnoreCase(ConstantValues.MANUFACTURED_TAX)|string.equalsIgnoreCase(ConstantValues.IMPORTED_TAX))
			return true ;
		System.err.print(ITEM_TYPE_VALIDATION_ERROR);
		return false ;
	}

	//Validate Item Quantity
	public static boolean checkItemQuantity(String string) {
		try {
			 Integer.parseInt(string);
		} catch (NumberFormatException e) {
			System.err.print(ITEM_QUANTITY_VALIDATION_ERROR);
			return false ;
		}
		return true ;
	}

}

