package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage 
{
	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(css = "h3.LC20lb.MBeuO.DKV0Md")
	WebElement clickOnHomepageLink;
  
	public void click_homepage_link()
	{
		clickOnHomepageLink.click();
	}
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElement clickOnSignupLink;
  
	public void click_signup()
	{
		clickOnSignupLink.click();
	}
	
	@FindBy(name = "name")
	WebElement enterName;
  
	public void enter_name(String name)
	{
		enterName.sendKeys(name);
	}
	
	@FindBy(xpath = "//*[@data-qa='signup-email']")
	WebElement enterEmail;
  
	public void enter_email(String email)
	{
		enterEmail.sendKeys(email);
	}
	
	@FindBy(xpath = "//*[@data-qa='signup-button']")
	WebElement clickSignupButton;
  
	public void click_signup_button()
	{
		clickSignupButton.click();
	}
	
	@FindBy(id = "id_gender1")
	WebElement clickOnTitleButton;
	 
	public void click_title_button()
	{
		clickOnTitleButton.click();
	}
		
	@FindBy(id = "password")
	WebElement enterPassword;
	  
	public void enter_password(String password)
	{
		enterPassword.sendKeys(password);
	}
		
	@FindBy(id = "days")
	WebElement selectDay;
	  
	public void select_day()
	{
		selectDay.click();
	}
		
	@FindBy(id = "months")
	WebElement selectMonth;
	  
	public void select_month()
	{
		selectMonth.click();
	}
		
	@FindBy(id = "years")
	WebElement selectYear;
	  
	public void select_year()
	{
		selectYear.click();
	}
	
	@FindBy(id = "first_name")
	WebElement enterFirstName;
	  
	public void enter_firstname(String firstname)
	{
		enterFirstName.sendKeys(firstname);
	}
	
	@FindBy(id = "last_name")
	WebElement enterLastName;
	  
	public void enter_lastname(String lastname)
	{
		enterLastName.sendKeys(lastname);
	}
	
	@FindBy(id = "address1")
	WebElement enterAddress;
	  
	public void enter_address(String address)
	{
		enterAddress.sendKeys(address);
	}
	
	@FindBy(id = "state")
	WebElement enterState;
	  
	public void enter_state(String state)
	{
		enterState.sendKeys(state);
	}
	
	@FindBy(id = "city")
	WebElement enterCity;
	  
	public void enter_city(String city)
	{
		enterCity.sendKeys(city);
	}
	
	@FindBy(id = "zipcode")
	WebElement enterZipcode;
	  
	public void enter_zipcode(String zipcode)
	{
		enterZipcode.sendKeys(zipcode);
	}
	
	@FindBy(id = "mobile_number")
	WebElement enterMobileNumber;
	  
	public void enter_mobilenumber(String number)
	{
		enterMobileNumber.sendKeys(number);
	}
	
	@FindBy(css = "button.btn.btn-default")
	WebElement clickOnCreateButton;
	  
	public void click_on_create_button()
	{
		clickOnCreateButton.click();
	}
	
	@FindBy(css = "i.fa.fa-trash-o")
	WebElement clickOnDeleteAccountButton;
	  
	public void click_on_delete_account_button()
	{
		clickOnDeleteAccountButton.click();
	}
	
	@FindBy(css = "a.btn.btn-primary")
	WebElement clickOnContinueButton;
	  
	public void click_continue()
	{
		clickOnContinueButton.click();
	}

}
