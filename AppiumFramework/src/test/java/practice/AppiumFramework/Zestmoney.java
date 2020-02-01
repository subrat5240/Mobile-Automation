package practice.AppiumFramework;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home_clubmahindra;

public class Zestmoney {
	WebDriver driver;
	Properties prop =new Properties ();
	
	@Test 
	public void openUrl() throws Exception
	{
		FileInputStream fis=new FileInputStream("F:\\MyProjects\\AppiumFramework\\src\\main\\java\\practice\\AppiumFramework\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.gecko.driver", "F:\\MyProjects\\AppiumFramework\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		Home_clubmahindra fc = new Home_clubmahindra(driver);
		 driver.get(prop.getProperty("url"));
		  Thread.sleep(8000);
		driver.manage().window().maximize();
		fc.clikonSearch().click();
		fc.mainSearch().sendKeys("Club Mahindra",Keys.RETURN);
		Thread.sleep(5000);
		fc.clickhotel().click();
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
	    driver.switchTo().window(childid);
		fc.writeReview().click();
		
		driver.switchTo().window(childid);
		fc.rating();
		fc.ratingpoint().click();
		
}
}
