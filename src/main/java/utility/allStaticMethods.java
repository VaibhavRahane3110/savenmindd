package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allStaticMethods {

    //Driver
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.savenmindd.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       //ChromeDriver is the class which extends webDriver Interface
		driver.manage().window().maximize();
		return driver;
	}
	
    //DropDown
	public static void selectValueFromDropdown(WebElement element, String option ) {   //To select multiple options increase String option1, String option2....so on
		Select select = new Select(element);
		select.selectByVisibleText(option);
		//select.isMultiple();   to check whether dropDown is accepting multiple values or not
		
	}
	
	//Date
	public static void selectDateFromDatePicker(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}
	
	//Scroll
	public static void scrollIntoView(WebElement element, WebDriver driver1) {
		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
   //Click using JavaScript
	public static void clickUsingJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;                 // selenium interface
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	public static void takeScreenShot(WebDriver driver, String name) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("/com.savenmind.project/resources/Screenshots" + name + ".png"));
	} catch(Exception e) {
		
	}
	
	
	
	
	
	
	
	}
}
