package Test_Package;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Object_Repositories.Pages_Xpath;

public class TC_19_Sort_the_products_in_price_low_to_high_order_perfromance extends BaseClass {
	public static WebDriverWait wait;
	@Test
	public void Sort_the_products_in_price_low_to_high_order_perfromance() throws InterruptedException {

		wait = new WebDriverWait(driver, 20);
		Pages_Xpath obj = new Pages_Xpath(driver);
        wait.until(ExpectedConditions.elementToBeClickable(obj.Select_filter()));
		Select s = new Select(obj.Select_filter());

		s.selectByVisibleText("Price (low to high)");
		
		
		int Size=obj.Product_Price().size();
		 double a[] = new double[Size];
		 double b[] = new double[Size];
		for (int i=0;i<=Size-1;i++)
		{
			
		Thread.sleep(500);
			
		String Prices=obj.Product_Price().get(i).getText();
		
		String numberString = Prices.replaceAll("[^0-9.]", "");
	    double price = Double.parseDouble(numberString);
	
		 a[i]=price;  //sorted array
		 b[i]=price;  //non sorted array
		}
		 System.out.println("Before sort"+Arrays.toString(a));
		 
		 Arrays.sort(a);
		 System.out.println("After sort"+Arrays.toString(a));
		 
		 boolean areEqual = true;

	        // Check if the arrays have the same length
	        if (a.length != b.length) {
	            areEqual = false;
	        } else {
	            // Compare the corresponding elements of the arrays
	            for (int i = 0; i < a.length; i++) {
	                if (a[i] != b[i]) {
	                    areEqual = false;
	                    break;
	                }
	            }
	        }

	        
	        // Print the result
	        if (areEqual) {
	            System.out.println("The arrays are equal.");
	            Assert.assertEquals(a,b);
	        } else {
	            System.out.println("The arrays are not equal.");
	            Assert.fail();
	        }
	  

	}
	

}
