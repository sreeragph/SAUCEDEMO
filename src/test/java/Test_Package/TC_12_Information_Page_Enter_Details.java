package Test_Package;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;


public class TC_12_Information_Page_Enter_Details extends BaseClass {
	@Test
	public void Information_Page_Enter_Details() throws InterruptedException {
		
		Pages_Xpath obj = new Pages_Xpath(driver);
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
//		
//		obj.firstName().sendKeys(Ex.getCellData("Sheet1", "FirstName", 2));
//		
//		obj.lastName().sendKeys(Ex.getCellData("Sheet1", "LastName", 2));
//		
//		obj.postalCode().sendKeys(Ex.getCellData("Sheet1", "PostCode", 2));
//		
//		obj.continue1().click();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;	
//		js.executeScript("arguments[0].scrollIntoView(true)", obj.finish());
		
		obj.finish().click();
		
		String ThankYou = obj.ThankYou().getText();
		 if (ThankYou.equals("Thank you for your order!") )
	     {

	         Assert.assertEquals(ThankYou,"Thank you for your order!");
	         
	         System.out.println("Checkout: Complete! Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
		 
		 
		 obj.back_to_products().click();
		 
		 obj.Logout1().click();
		
		 obj.Logout2().click();
		
	}
	
}
