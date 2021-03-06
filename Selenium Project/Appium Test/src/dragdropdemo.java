import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class dragdropdemo extends base_function {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t =new TouchAction(driver);
		
		WebElement source=driver.findElementsByClassName("android.view.View").get(1);
		WebElement destination=driver.findElementsByClassName("android.view.View").get(2);
		
//t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();		
       t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

}
