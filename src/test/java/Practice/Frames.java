package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	
	@Test
	public void handleFrame() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		WebElement frame= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		String str= driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		WebElement ele= driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(ele.getAttribute("innerHTML"));
		System.out.println(str);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
		
		
	}
}
