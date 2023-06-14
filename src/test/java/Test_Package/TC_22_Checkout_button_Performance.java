package Test_Package;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;


public class TC_22_Checkout_button_Performance extends BaseClass {
	@Test
	public void add_all_items() {
		
		Pages_Xpath obj = new Pages_Xpath(driver);
		
	
	
	String Checkou_Text= obj.Checkout_Text().getText();
	
	if(Checkou_Text.toLowerCase().contains("Checkout: Your Information".toLowerCase()))
		{
		 Assert.assertEquals(Checkou_Text,"Checkout: Your Information".toLowerCase());
         
         System.out.println("shopping_cart_badge Page Verified Successfully");
		}
	    obj.checkout().click();
	
       ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
       
      
       obj.continue1().click();
       
       
       String error = obj.error().getText();
		 if (error.equals(prop.getProperty("errorFirstname")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("errorFirstname"));
	         
	         System.out.println("first name filed Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
       
		 obj.firstName().sendKeys(Ex.getCellData("Sheet1", "FirstName", 2));
	       obj.continue1().click();
	       String error2 = obj.error().getText();
			 if (error2.equals(prop.getProperty("lastnamerequired")) )
		     {

		         Assert.assertEquals(error2,prop.getProperty("lastnamerequired"));
		         
		         System.out.println("lastname filed Verified Successfully");
		         
		     } 
		     
		     else 
		    
		     {
		     	
		     	System.out.println ("Fail");
		     	
		         Assert.fail();
		     }
		 
			 obj.firstName().sendKeys(Ex.getCellData("Sheet1", "FirstName", 2));
			 obj.lastName().sendKeys(Ex.getCellData("Sheet1", "LastName", 2));
		       obj.continue1().click();
		       String error3 = obj.error().getText();
				 if (error3.equals(prop.getProperty("postrequired")) )
			     {

			         Assert.assertEquals(error3,prop.getProperty("postrequired"));
			         
			         System.out.println("Postal code filed Verified Successfully");
			         
			     } 
			     
			     else 
			    
			     {
			     	
			     	System.out.println ("Fail");
			     	
			         Assert.fail();
			     }
			 
			 
		obj.firstName().sendKeys(Ex.getCellData("Sheet1", "FirstName", 2));
		
		obj.lastName().sendKeys(Ex.getCellData("Sheet1", "LastName", 2));
		
		obj.postalCode().sendKeys(Ex.getCellData("Sheet1", "PostCode", 2));
		
		obj.continue1().click();
	    
	    
	    
	}
}
