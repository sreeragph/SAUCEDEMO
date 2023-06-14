package Test_Package;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;


public class TC_23_Information_Page_Enter_Details_Performance extends BaseClass {
	
	public static WebDriverWait wait;
	
	
	@Test
	public void Information_Page_Enter_Details() throws InterruptedException {
		wait = new WebDriverWait(driver, 20);
		Pages_Xpath obj = new Pages_Xpath(driver);
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		 wait.until(ExpectedConditions.elementToBeClickable(obj.finish()));
	
		
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
