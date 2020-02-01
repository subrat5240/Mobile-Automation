package practice.AppiumFramework;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		System.setProperty("webdriver.chrome.driver", "F:\\MyProjects\\AppiumFramework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Home_clubmahindra fc = new Home_clubmahindra(driver);
		 driver.get(prop.getProperty("url"));
		  Thread.sleep(8000);
		driver.manage().window().maximize();
		fc.clikonSearch().click();
		fc.mainSearch().sendKeys("Club Mahindra");
		fc.mainSearch().sendKeys(Keys.DOWN, Keys.RETURN);
		fc.writeReview().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		
		
		
}
}
