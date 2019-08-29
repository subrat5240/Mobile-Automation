package practice.AppiumFramework;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.FormPage;

public class ecommerce_tc_4 extends base_function{

	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}


@Test	
public void totalValidation() throws IOException, InterruptedException
{
	   service=startServer();
	    
		AndroidDriver<AndroidElement> driver=Capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FormPage fp=new FormPage(driver);
		Utilities ut=new Utilities(driver);
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Subrat");
	fp.namefield.sendKeys("Subrat");
	driver.hideKeyboard();
	//driver.findElement(By.xpath("//*[@text='Female']")).click();
	fp.radio.click();
	
	//driver.findElement(By.id("android:id/text1")).click();
	fp.getcountrySelection().click();;
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));");
	ut.scrollToText("Australia");
	
	//driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	fp.selectelement.click();
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	fp.letsShop.click();
	
	
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();	
	Thread.sleep(5000);

	

//String amount1=	driver.findElement(By.xpath("//*[@text='$160.97']")).getText();
//String amount2=	driver.findElement(By.xpath("//*[@text='$120.0']")).getText();
	String amount1=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	String amount2=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	

amount1= amount1.substring(1);
amount2= amount2.substring(1);

double amount1value=Double.parseDouble(amount1);
double amount2value=Double.parseDouble(amount2);

double sumofProducts=amount1value+amount2value;
System.out.println("Sum of products=" + sumofProducts);


String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
total= total.substring(1);
double totalvalue=Double.parseDouble(total);

System.out.println("Total value of products=" + totalvalue );
Assert.assertEquals(sumofProducts, totalvalue);

service.stop();	

}
	
}