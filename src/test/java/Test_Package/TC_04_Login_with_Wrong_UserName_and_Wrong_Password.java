package Test_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_04_Login_with_Wrong_UserName_and_Wrong_Password extends BaseClass {

	@Test
	private void Login_with_Wrong_UserName_and_Wrong_Password() throws InterruptedException {
		
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		obj.Username().clear();
		obj.Username().sendKeys(Ex.getCellData("Sheet1", "Invalid_UserName", 2));
		obj.password().clear();
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Invalid_UserName", 2));
		
		obj.login_button().click();
		
		String error = obj.error().getText();
		 if (error.equals(prop.getProperty("Login_error_2")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("Login_error_2"));
	         
	         System.out.println("Login Page Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
	
	
	
}
