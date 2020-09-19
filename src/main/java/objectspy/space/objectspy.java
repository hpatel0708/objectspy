package objectspy.space;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectspy {

	WebDriver driver;

	@Before

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

		driver = new ChromeDriver();

		driver.get("http:/objectspy.space/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test

	public void learnLocator() {

		driver.findElement(By.name("firstname")).sendKeys("abc");

		driver.findElement(By.name("lastname")).sendKeys("xyz");

		driver.findElement(By.xpath("//input[@class=\"input-file\"]")).click();

		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Selenium is fun");
		
		//driver.findElement(By.xpath("//input[@id="sex-0"]"))
		
		
        

	}

}
