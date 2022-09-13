package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	WebElement getTextBox;
	WebElement getDropDown;
	WebElement getBackTOTop;
	WebElement getMobiles;
	WebElement getCart;
	WebElement getSearchIcon;

	// Driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// TextBox
	public WebElement getTextBox() {
		this.getTextBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @type='text' ]"));
		return getTextBox;
	}
	
	//Search Icon
	public WebElement getSearchIcon() {
		this.getSearchIcon=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		return getSearchIcon;
	}

	// DropDown
	public WebElement getDropDown() {
		this.getDropDown = driver.findElement(By.xpath(
				"//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		return getDropDown;
	}

	// Scroll To the End and click (Again back to top)
	public WebElement getBackToTop() {
		this.getBackTOTop = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		return getBackTOTop;
	}

	//Click on Mobile Option
	public WebElement getMobiles() {
		this.getMobiles= driver.findElement(By.xpath("//a[text()='Mobiles']"));
		return getMobiles;
	}

	//My Cart
	public WebElement getCart() {
		this.getCart=driver.findElement(By.xpath("//a[@id='nav-cart']"));
		return getCart;
	}
	
	//
	
	
	
	
	

}

