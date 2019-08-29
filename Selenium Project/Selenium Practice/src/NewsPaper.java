

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewsPaper {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Practice\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dharitriepaper.in/edition/3013/bhubaneswar");
		Thread.sleep(2500);
		driver.get("http://dharitriepaper.in/edition/3013/bhubaneswar/page/3");
		driver.get("http://dharitriepaper.in/edition/3013/bhubaneswar/page/4");
		Thread.sleep(3000);
		driver.close();	 

}
}
