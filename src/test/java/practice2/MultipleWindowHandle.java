package practice2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandle {

	@Test
	public void handleWindows() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindowHandle = driver.getWindowHandle();
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@id,'windowB')]"));
		button.click();
	
		Set<String> windowHandle = driver.getWindowHandles();

		for (String str : windowHandle) {
			if(!(str.equals(parentWindowHandle))) {
				driver.switchTo().window(str);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
		
		}
	
}
