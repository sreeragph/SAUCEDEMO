package Test_Package;


import org.testng.annotations.Test;

import Common.BaseClass;
import Excel_Utils.ExcelDataProvider;
import Object_Repositories.Pages_Xpath;

public class TC_01_Login extends BaseClass {

	@Test
	private void Login() throws InterruptedException {
		System.out.println("Login Page");
		ExcelDataProvider Ex=new ExcelDataProvider(projectPath+"/Test_Data/Sauce_demo.xlsx");
		
	
		Pages_Xpath obj = new Pages_Xpath(driver);
		Thread.sleep(1000);
		obj.Username().sendKeys(Ex.getCellData("Sheet1", "UserName", 2));
		Thread.sleep(1000);
		obj.password().sendKeys(Ex.getCellData("Sheet1", "Password", 2));
		Thread.sleep(1000);
		obj.login_button().click();
	}
}
