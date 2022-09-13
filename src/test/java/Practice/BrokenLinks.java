package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.allStaticMethods;


public class BrokenLinks {

	HttpURLConnection huc;             //Class in java provides HTTP response codes

	@Test
	public void brokenLink() throws IOException {
		WebDriver driver = allStaticMethods.getDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> list= driver.findElements(By.xpath("//a[@href]"));
		System.out.println(list.size());
		
		for (WebElement elm : list) {
			
//			System.out.println(elm.getAttribute("href"));
			huc = (HttpURLConnection) new URL(elm.getAttribute("href")).openConnection();
			huc.setConnectTimeout(1000);
			huc.connect();
			System.out.println(huc.getResponseMessage());
			Assert.assertEquals(huc.getResponseCode(), 200);
		
			if (huc.getResponseCode() == 200) {

				System.out.println(elm.getAttribute("href") + ":" + "Link is working fine");
			}

			else {
				System.out.println(elm.getAttribute("href") + ":" + "Link is not working fine");
			}
		}
	
	}
}
