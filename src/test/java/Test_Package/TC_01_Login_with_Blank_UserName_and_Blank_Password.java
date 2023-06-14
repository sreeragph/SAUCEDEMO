package Test_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_01_Login_with_Blank_UserName_and_Blank_Password extends BaseClass{
	public static WebDriverWait wait;
	
	@Test
	private void Login_with_Blank_UserName_and_Blank_Password() throws InterruptedException {
		System.out.println("Login Page");
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		wait = new WebDriverWait(driver, 10);
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(obj.Username()));
		obj.Username().sendKeys("");
		wait.until(ExpectedConditions.elementToBeClickable(obj.password()));
		obj.password().sendKeys("");
		wait.until(ExpectedConditions.elementToBeClickable(obj.login_button()));
		obj.login_button().click();
		
		String error = obj.error().getText();
		 if (error.equals(prop.getProperty("Login_error_Msg")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("Login_error_Msg"));
	         
	         System.out.println("Policy Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
}
