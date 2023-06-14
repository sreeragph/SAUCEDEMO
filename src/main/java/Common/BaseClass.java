package Common;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;







public class BaseClass {
	protected static WebDriverWait wait	;
	public static WebDriver driver;   //instance
	public static Properties prop;
	public static String projectPath = System.getProperty("user.dir");
	
	public BaseClass() {
		PageFactory.initElements(driver, this);
	}
	
	@BeforeSuite
	public void initdriver() throws IOException {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
		prop = new Properties();
        FileInputStream fis = new FileInputStream(projectPath + "/Configuration/config.properties");
        prop.load(fis);
     
        
        if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
        	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome driver started successfully");
		
			
			driver.get(prop.getProperty("baseURL"));
			

		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("EdgeDriver started successfully");
		
		
			
			driver.get(prop.getProperty("baseURL"));
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("FirefoxDriver started successfully");
			
			
			driver.get(prop.getProperty("baseURL"));
			
		    }
        
        
        
        
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();
    	
  
		

	}
	
     @AfterSuite
	public void driverclose() {       
//		driver.close();
//		driver.quit();

	}

	
}
