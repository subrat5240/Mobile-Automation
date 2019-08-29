package practice.AppiumFramework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;
import pageObjects.dependancies;



public class ApiDemoTest extends base_function{

	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	public void apiDemo(String input) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		
		 service=startServer();

		//Capabilities();
		AndroidDriver<AndroidElement> driver=Capabilities("apiDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hp=new HomePage(driver);
		Preferences p=new Preferences(driver);
		dependancies d=new dependancies(driver);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		hp.Preferences.click();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		p.Preferencedependencies.click();
		
		//driver.findElementById("android:id/checkbox").click();
		d.checkbox.click();
		
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		d.RelativeLayout.click();
		
		//driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		d.EditText.sendKeys(input);
		Thread.sleep(3000);
		//driver.findElementById("android:id/button1").click();
		
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		d.buttons.get(1).click();
		
		service.stop();
		
		
	}

	
}
