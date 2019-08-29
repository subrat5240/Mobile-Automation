package pageObjects;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base_function {
	
	public static AppiumDriverLocalService service;
	
	public void startServer()
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		//File fs=new File(f,"General-Store.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Subratemulator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
	}
	
	
	

}
