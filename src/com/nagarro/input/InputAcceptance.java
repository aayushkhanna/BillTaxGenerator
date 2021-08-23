package com.nagarro.input;
/*
 * @Aayush Khanna
 * Trainee Technology
 * 
 * Input Acceptance Class
 * 
 *  In this class inputs are being asked from the user
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nagarro.calculation.ImportedTax;
import com.nagarro.calculation.ManufacturedTax;
import com.nagarro.calculation.RawTax;
import com.nagarro.model.ConstantValues;
import com.nagarro.model.Item;



public class InputAcceptance extends ConstantValues{
	
	//Declaration of Buffered Reader
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)) ;
	public static Item enterInput() throws IOException
	{
		//Declaration of variables
		String itemName ;
		String string ;
		String itemType ;
		Double itemPrice ;
		int itemQuantity ;
		boolean isValid ;

		
		//User input for item Name
		System.out.println(INPUT_ITEM_DETAILS);
		System.out.print(INPUT_ITEM_NAME);
		itemName = bufferedReader.readLine();

		//User input for item Price
		System.out.print(INPUT_ITEM_PRICE);
		//Validating item Price 
		do{
			string = bufferedReader.readLine();
			isValid  = InputValidation.checkItemPrice(string);
		} while(!isValid) ;
		itemPrice =  Double.parseDouble(string) ;

		
		//User input for type of item
		System.out.print(INPUT_ITEM_TYPE);
		//Validating item type
		do{
			string = bufferedReader.readLine();
			isValid  = InputValidation.checkItemType(string);
		}while(!isValid) ;
		itemType = string.toLowerCase() ;

		
		//User input for item Quantity
		System.out.print(INPUT_ITEM_QUANTITY);
		//Validating Item Quantity
		do{
			string = bufferedReader.readLine();
			isValid  = InputValidation.checkItemQuantity(string);
		}while(!isValid) ;
		itemQuantity = Integer.parseInt(string);

		//Making object of Item class
		Item item ;
		
		//Switch case for calculation of Tax
		switch(itemType)
		{
			case ConstantValues.RAW_TAX :
				item = new RawTax(itemName,itemPrice,itemQuantity,itemType);
				break ;
			case ConstantValues.MANUFACTURED_TAX:
				item = new ManufacturedTax(itemName,itemPrice,itemQuantity,itemType);
				break ;
			default :
				item = new ImportedTax(itemName, itemPrice, itemQuantity, itemType);
				break ;

		}
		return item ;

	}
}


