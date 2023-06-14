package Test_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_06_1_Login_with_Locked_UserName extends BaseClass {

	@Test
	private void Login_with_Locked_UserName() throws InterruptedException {
		System.out.println("Login Page");
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		obj.Username().clear();
		obj.Username().sendKeys(Ex.getCellData("Sheet1", "LockedUser", 2));
		obj.password().clear();
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Password", 2));
		
		obj.login_button().click();
		
		String error = obj.error().getText();
		 if (error.equals(prop.getProperty("lockedMsg")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("lockedMsg"));
	         
	         System.out.println("Login_with_Locked_UserName Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
	
	
	
}
