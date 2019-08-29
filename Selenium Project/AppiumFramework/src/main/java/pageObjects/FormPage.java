package pageObjects;
import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	
	public FormPage(AndroidDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
		@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
		public WebElement namefield; 
		
		@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
		public WebElement radio; 
		
		@AndroidFindBy(id="android:id/text1")
		public WebElement selectbox;
		
		@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"Australia\\\");")
		public WebElement scrolldown;
	
			
		@AndroidFindBy(xpath="//*[@text='Australia']")
		public WebElement selectelement;
	
		@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
		public WebElement letsShop;
		
		public WebElement getcountrySelection()
		{
			return selectbox;
		}
		
		

}
