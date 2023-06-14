package Object_Repositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BaseClass;



public class Pages_Xpath {

	public Pages_Xpath(WebDriver driver) { //(values are parameter)

//		this.driver =driver;
		BaseClass.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='user-name']")
	WebElement Username;
	public WebElement Username() {
		return Username;
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	public WebElement password() {
		return password;
	}
	
	@FindBy(xpath="//input[@name='login-button']")
	WebElement login_button;
	public WebElement login_button() {
		return login_button;
	}
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement error;
	public WebElement error() {
		return error;
	}
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement HomeText;
	public WebElement HomeText() {
		return HomeText;
	}
		
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	List<WebElement> Product_Price;
	public List<WebElement> Product_Price() {
		return Product_Price;
	}
	
	
	
	@FindBy(xpath="//select[@data-test='product_sort_container']")
	WebElement Select_filter;
	public WebElement Select_filter() {
		return Select_filter;
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/button")
	List<WebElement> Add_to_Cart;
	public List<WebElement> Add_to_Cart() {
		return Add_to_Cart;
	}
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement shopping_cart_badge;
	public WebElement shopping_cart_badge() {
		return shopping_cart_badge;
	}
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	List<WebElement> inventory_item_name;
	public List<WebElement> inventory_item_name() {
		return inventory_item_name;
	}
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	List<WebElement> inventory_item_Price;
	public List<WebElement> inventory_item_Price() {
		return inventory_item_Price;
	}
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small cart_button']")
	List<WebElement> Remove;
	public List<WebElement> Remove() {
		return Remove;
	}
	
	@FindBy(xpath="//button[@name='checkout']")
	WebElement checkout;
	public WebElement checkout() {
		return checkout;
	}
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	public WebElement firstName() {
		return firstName;
	}
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	public WebElement lastName() {
		return lastName;
	}
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postalCode;
	public WebElement postalCode() {
		return postalCode;
	}
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement continue1;
	public WebElement continue1() {
		return continue1;
	}
	@FindBy(xpath="//button[@name='finish']")
	WebElement finish;
	public WebElement finish() {
		return finish;
	}
	
	@FindBy(xpath="//button[@name='back-to-products']")
	WebElement back_to_products;
	public WebElement back_to_products() {
		return back_to_products;
	}
	@FindBy(xpath="//div[@class='header_secondary_container']//span")
	WebElement Checkout_Text;
	public WebElement Checkout_Text() {
		return Checkout_Text;
	}
	@FindBy(xpath="//div[@class='bm-burger-button']")
	WebElement Logout1;
	public WebElement Logout1() {
		return Logout1;
	}
	
	@FindBy(xpath="(//a[@class='bm-item menu-item'])[3]")
	WebElement Logout2;
	public WebElement Logout2() {
		return Logout2;
	}
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement ThankYou;
	public WebElement ThankYou() {
		return ThankYou;
	}
	
}
