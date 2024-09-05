package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage 
{
	public WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(css = "h3.LC20lb.MBeuO.DKV0Md")
	WebElement clickOnHomepage;
  
	public void click_homepage_link()
	{
		clickOnHomepage.click();
	}
	
	@FindBy(css = "i.material-icons.card_travel")
	WebElement clickOnProducts;
  
	public void click_on_products()
	{
		clickOnProducts.click();
	}
	
	@FindBy(css = "i.fa.fa-shopping-cart")
	WebElement clickOnCart;
  
	public void clik_on_cart()
	{
		clickOnCart.click();
	}
	
	@FindBy(xpath = "//*[text()=' Test Cases']")
	WebElement clickOnTestCases;
  
	public void clik_on_test_cases()
	{
		clickOnTestCases.click();
	}
	
	@FindBy(xpath = "//*[text()=' API Testing']")
	WebElement clickOnApi;
  
	public void clik_on_api()
	{
		clickOnApi.click();
	}
	
	@FindBy(css = "i.fa.fa-youtube-play")
	WebElement clickOnVideoTutorials;
  
	public void clik_on_video_tutorials()
	{
		clickOnVideoTutorials.click();
	}

}
