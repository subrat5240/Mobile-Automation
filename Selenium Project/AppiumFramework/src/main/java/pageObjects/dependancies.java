package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class dependancies {
	
	
	public dependancies(AndroidDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement checkbox; 
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement RelativeLayout; 
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement EditText; 
	
	@AndroidFindBy(className = "android.widget.Button")    
	public List <WebElement> buttons;
	
	
	
}
