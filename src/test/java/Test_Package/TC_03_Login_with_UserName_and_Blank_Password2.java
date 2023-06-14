package Test_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_03_Login_with_UserName_and_Blank_Password2 extends BaseClass {

	@Test
	private void Login_with_UserName_and_Blank_Password() throws InterruptedException {
	
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		
		obj.Username().sendKeys("");
		obj.password().clear();
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Password", 2));
		
		obj.login_button().click();
		
		String error = obj.error().getText();
		 if (error.equals(prop.getProperty("Login_error_psw_Msg")) )
	     {

	         Assert.assertEquals(error,prop.getProperty("Login_error_psw_Msg"));
	         
	         System.out.println("Login Page Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
	
	
	
}
