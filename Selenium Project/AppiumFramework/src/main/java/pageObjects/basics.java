package pageObjects;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class basics extends base_function{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		Capabilities();
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hp=new HomePage(driver);
		Preferences p=new Preferences(driver);
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		hp.Preferences.click();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		p.Preferencedependencies.click();
		
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		Thread.sleep(3000);
		//driver.findElementById("android:id/button1").click();
		
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
		
		
		
	}

}
