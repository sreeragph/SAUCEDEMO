package Test_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_05_Login_with_Wrong_UserName_and_Password extends BaseClass {

	@Test
	private void Login_with_Wrong_UserName_and_Password() throws InterruptedException {
		System.out.println("Login Page");
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		obj.Username().clear();
		obj.Username().sendKeys(Ex.getCellData("Sheet1", "InvalidPassword", 2));
		obj.password().clear();
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Password", 2));
	
		obj.login_button().click();
		
		String error = obj.error().getText();
		 if (error.equals(prop.getProperty("Login_error_Msg")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("Login_error_Msg"));
	         
	         System.out.println("Login Page Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
	
	
	
}
