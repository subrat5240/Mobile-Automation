import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautomatortest extends base_function{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElementByAndroidUIAutomator("attribute(\"value\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//validate clickble property
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
				
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
	}

}
