package Test_Package;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;

import Object_Repositories.Pages_Xpath;


public class TC_16_remove_items_that_have_a_price_less extends BaseClass {
	@Test
	public void remove_items_that_have_a_price_less() {
		
		Pages_Xpath obj = new Pages_Xpath(driver);
		
		 obj.shopping_cart_badge().click();
		 
		int Size=obj.inventory_item_Price().size();
		

		for (WebElement priceElement : obj.inventory_item_Price()) {
		 {
		
			 String GetPrice=priceElement.getText();
			 String numericString = GetPrice.replaceAll("[^0-9.]", ""); // Remove non-numeric characters except decimal point
			 double Price = Double.parseDouble(numericString);			 
			 
			 if(Price<15)
			 {
				 int index =  obj.inventory_item_Price().indexOf(priceElement);
				 obj.Remove().get(index).click();
			 }
									
		 }
		 
		 
		
		 
		 
	}
	
	}
}
