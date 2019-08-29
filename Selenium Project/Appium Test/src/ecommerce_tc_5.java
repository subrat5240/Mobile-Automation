import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_5 extends base_function{

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Subrat");
	driver.hideKeyboard();
	driver.findElement(By.xpath("//*[@text='Female']")).click();	
	driver.findElement(By.id("android:id/text1")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();	
	Thread.sleep(5000);
	

//String amount1=	driver.findElement(By.xpath("//*[@text='$160.97']")).getText();
//String amount2=	driver.findElement(By.xpath("//*[@text='$120.0']")).getText();
//String amount1=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
//String amount2=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	
	
	//Mobile Gestures
	
	TouchAction t =new TouchAction(driver);
		
WebElement checkbox=driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']"));
t.tap(tapOptions().withElement(element(checkbox))).perform();
//driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
	
WebElement tc=driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));	
t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
driver.findElement(By.xpath("//*[@text='CLOSE']")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();	

}
	
}