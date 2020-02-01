package pageObjects;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_clubmahindra {
	
	WebDriver driver;
    
    public Home_clubmahindra(WebDriver driver)
    {
                    this.driver = driver;
                    PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//div[@class='brand-header-GlobalNavBar__searchWrap--35nok']")
    WebElement clikonSearch;
    
    @FindBy(xpath="//input[@id='mainSearch']") 
    WebElement mainSearch;
    
    @FindBy(linkText="Write a review") 
    WebElement writeReview;
    
    @FindBy(xpath="//div[@class='result-title']") 
    WebElement clickhotel;
    
    @FindBy(xpath="//*[@id='bubble_rating']") 
    WebElement rating;
    
    @FindBy(xpath="//div[@class='ui_bubble_rating_fl_bubble_50']") 
    WebElement ratingpoint;
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
    public WebElement clickhotel()
    {
                    return clickhotel; // 
                    
    }
    public WebElement rating()
    {
    	Actions a = new Actions(driver);
    a.moveToElement(rating).build().perform();
                    return rating;
    }
    public WebElement ratingpoint()
    {
                    return ratingpoint; // 
                    
    }
    
}
