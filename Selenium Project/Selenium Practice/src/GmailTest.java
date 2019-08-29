import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium Project\\Selenium Practice\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		driver.findElement(By.id("Email")).sendKeys(" subratrath89");
		//Thread.sleep(10000);
		//driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.xpath(".//*[@id='next']")).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.id("Passwd")).sendKeys("subrat@5240");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		
		
	}
}
