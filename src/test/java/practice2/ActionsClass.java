package practice2;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.*;

public class ActionsClass {

	@Test
	public static void Actions() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Action action;

		WebElement SearchArea = driver.findElement(By.xpath("//input[@name='q']"));
		Actions actions = new Actions(driver);
		actions.keyDown(SearchArea, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		actions.keyDown(SearchArea, Keys.BACK_SPACE).keyUp(SearchArea, Keys.BACK_SPACE).build().perform();
		actions.sendKeys(SearchArea, "Facebook").build().perform();
		actions.contextClick(SearchArea).build().perform();
		
		System.out.println("a");
	}
}
