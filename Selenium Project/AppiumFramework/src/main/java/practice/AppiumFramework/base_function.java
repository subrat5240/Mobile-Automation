package practice.AppiumFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base_function {
	
	public static AppiumDriverLocalService service;
	
	public static AndroidDriver<AndroidElement> driver;
	public AppiumDriverLocalService startServer()
	{
		boolean flag= checkIfServerIsRunnning(4723);
		if(!flag)
		{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		}
		return service;
	}
	
	/*public static void startEmulator() throws IOException, InterruptedException
	{

		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator - Shortcut");
		Thread.sleep(8000);
	}*/
	
public static boolean checkIfServerIsRunnning(int port) 
{
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException {
		// TODO Auto-generated method stub
		System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\practice\\AppiumFramework\\global.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		
		
		File appDir=new File("src");
		File fs=new File(appDir,(String) prop.get(appName));
		String device=(String)prop.getProperty("device");
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Subratemulator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
	}
	
	/*public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	FileUtils.copyFile(scrfile,new File("G:\\Selenium Project\\AppiumFramework"+"\\"+s+".png"));
	
	}*/
	
	
	
}
