package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage 
{
	public WebDriver driver;
	
	public ContactusPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}

	@FindBy(xpath = "//*[text()=' Contact us']")
	WebElement clickOnContactUs;
  
	public void click_contact_us()
	{
		clickOnContactUs.click();
	}
	
	@FindBy(name = "name")
	WebElement enterNameAgain;
  
	public void enter_name_again(String Name)
	{
		enterNameAgain.sendKeys(Name);
	}
	
	@FindBy(name = "email")
	WebElement enterEmailAgain;
  
	public void enter_email_again(String Email)
	{
		enterEmailAgain.sendKeys(Email);
	}
	
	@FindBy(name = "subject")
	WebElement enterSubject;
  
	public void enter_subject(String Subject)
	{
		enterSubject.sendKeys(Subject);
	}
	
	@FindBy(id = "message")
	WebElement enterMessage;
  
	public void enter_message(String Message)
	{
		enterMessage.sendKeys(Message);
	}
	
	@FindBy(name = "submit")
	WebElement clickOnSubmit;
  
	public void click_submit()
	{
		clickOnSubmit.click();
	}
	
	@FindBy(css = "i.fa.fa-angle-double-left")
	WebElement clickOnHomeButton;
  
	public void click_home_button()
	{
		clickOnHomeButton.click();
	}	

}
