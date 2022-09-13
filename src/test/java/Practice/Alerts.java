package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import utility.allStaticMethods;

public class Alerts {

	@Test
	public void handleAlerts() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		allStaticMethods.clickUsingJavaScript(clickButton, driver);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("alert accepted");
		alert.accept();
		// alert.dismiss();
	}	
}
