package Test_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_07_Login_with_valid_UserName_and_Valid_Password extends BaseClass {

	@Test
	private void Login_with_valid_UserName_and_Valid_Password() throws InterruptedException {
		
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		obj.Username().clear();
		obj.Username().sendKeys(Ex.getCellData("Sheet1", "UserName", 2));
		obj.password().clear();
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Password", 2));
		
		obj.login_button().click();
		
		String Home = obj.HomeText().getText();
		 if (Home.equals("Swag Labs") )
	     {

	         Assert.assertEquals(Home,"Swag Labs");
	         
	         System.out.println("Login Page Verified Successfully");
	         
	     } 
	     
	     else 
	    
	     {
	     	
	     	System.out.println ("Fail");
	     	
	         Assert.fail();
	     }
	}
	
	
	
	
}
