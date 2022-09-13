package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyFile {

	@Test
	public void validLogin() throws IOException {
	
		File file = new File("C:\\Users\\vaibh\\eclipse-workspace\\com.savenmindd.project\\src\\test\\resources\\test.properties"); 
		FileInputStream fis = new FileInputStream(file);
				
		Properties properties = new Properties();    //Properties Class        
		properties.load(fis);
		System.out.println("get method from properties file " +properties.get("userName"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys((String) properties.getProperty("userName"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys((String) properties.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
    //	properties.setProperty("username2", "test2");
	//	properties.put("key1", "pass2");

		FileOutputStream fos = new FileOutputStream(file, false);
		properties.put("username3", "pass3");
		properties.store(fos, "this is write");
		
		fis.close();
		fos.close();
	}
}
