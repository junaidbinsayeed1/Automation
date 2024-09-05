package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	public WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(css = "i.material-icons.card_travel")
	WebElement clickOnProducts;
  
	public void click_on_products()
	{
		clickOnProducts.click();
	}
	
	@FindBy(xpath = "(//*[text()='View Product'])[2]")
	WebElement clickOnViewProductButton;
  
	public void click_on_view_product_button()
	{
		clickOnViewProductButton.click();
	}
	
}
