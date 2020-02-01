package pageObjects;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_clubmahindra {
	
	WebDriver driver;
    
    public Home_clubmahindra(WebDriver driver)
    {
                    this.driver = driver;
                    PageFactory.initElements(driver, this);
    }
    @FindBy(className="ui_icon search brand-global-nav-action-search-Search__icon--2DVjd")
    WebElement clikonSearch;
    
    @FindBy(xpath="//input[@id='mainSearch']") 
    WebElement mainSearch;
    
    @FindBy(linkText="Write a review") 
    WebElement writeReview;
    
	//////////////////////////////////////////////////////////////////
    public WebElement clikonSearch()
    {
                    return clikonSearch; // 
                    
    }
    public WebElement mainSearch()
    {
                    return mainSearch; // 
                    
    }
    public WebElement writeReview()
    {
                    return writeReview; // 
                    
    }
    
}
