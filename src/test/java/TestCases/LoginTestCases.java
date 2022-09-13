package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.allStaticMethods;

import Pages.LoginPage;

public class LoginTestCases {
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeClass
	public void launchURL() {
		driver= allStaticMethods.getDriver();
		driver.get("https://www.amazon.in");
		loginPage= new LoginPage(driver);
	}

	@Test
	public void verifyTextBox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginPage.getTextBox().sendKeys("iphone 13");
		loginPage.getSearchIcon().click();
		
//		//Verify element is present on webPage or not
//		WebElement element = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//        System.out.println(element.getAttribute("innerHTML"));
//
//        if(element.getAttribute("innerHTML").contains("Apple iPhone 13 (128GB) - Midnight")){
//        	System.out.println("Element is present");
//        }
//        else {
//        	System.out.println("element is not there");
//        }
	    }

	@Test
	public void verifyDropDown() {
		WebElement element= loginPage.getDropDown();
		element.click();
		allStaticMethods.selectValueFromDropdown(element, "Baby");
	}

	
	@Test
	public void verifyScroll() {
	WebElement element= loginPage.getBackToTop();
	allStaticMethods.scrollIntoView(element, driver);
	element.click();	
	}


 	@Test
	public void verifyMobile() {
		WebElement element = loginPage.getMobiles();
		element.click();
	}


 	@Test
	public void VerifyCart() {
		WebElement element = loginPage.getCart();
		element.click();
	}
}
