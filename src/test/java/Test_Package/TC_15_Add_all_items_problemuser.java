package Test_Package;


import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;

import Object_Repositories.Pages_Xpath;


public class TC_15_Add_all_items_problemuser extends BaseClass {
	@Test
	public void _Add_all_items_problemuser () {
		
		Pages_Xpath obj = new Pages_Xpath(driver);
		
		int Size=obj.Add_to_Cart().size();
		
	    String SSize=Integer.toString(Size);
	    
	    String Product_Clicked[] = new String[Size];
		 String Product_InCart[] = new String[Size];
	   
		for(int i=0;i<=Size-1;i++)
		{
			
          String inventory_item_name = obj.inventory_item_name().get(i).getText();
			
			Product_Clicked[i]=inventory_item_name;
			
			obj.Add_to_Cart().get(i).click();
			
			
		}
		String shopping_cart_badge = obj.shopping_cart_badge().getText();
		
		 if (SSize.equals(shopping_cart_badge) )
	     {

	         Assert.assertEquals(SSize,shopping_cart_badge);
	         
	         System.out.println("shopping_cart_badge Page Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
		
		
        System.out.println("inventory_item_name = "+Arrays.toString(Product_Clicked));
		 
	     obj.shopping_cart_badge().click();
	     
	     for(int j=0;j<=Size-1;j++)
			{
				
				String items_in_Cart = obj.inventory_item_name().get(j).getText();
				
				Product_InCart[j]=items_in_Cart;
			}
	     
	     System.out.println("inventory_items_in_Cart = "+Arrays.toString(Product_InCart));
	
	     boolean areArraysEqual = Arrays.equals(Product_InCart, Product_Clicked);

	     // Print the result
	        if (areArraysEqual) {
	            System.out.println("The inventory_items_in_Cart verified successfully");
	            Assert.assertEquals(Product_Clicked,Product_InCart);
	        } else {
	            System.out.println("The inventory_items_in_Cart not  verified successfully");
	            Assert.fail();
	        }
	
		
		
		
		
		
		
	}
	

}
