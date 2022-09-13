package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.allStaticMethods;

public class ScreenShot {

	@Test
	public void handleFrame() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.savenmind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File file= ss.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("/com.savenmind.project/src/test/resources/ScreenShot"+"rj.png"));
//	
	
		allStaticMethods.takeScreenShot(driver, "Rushi");
		
	}

}
