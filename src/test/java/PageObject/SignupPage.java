package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.Base;

public class SignupPage extends Base
{
	public WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElement clickOnSignupLink;
  
	public void click_signup()
	{
		clickOnSignupLink.click();
	}
	
	@FindBy(name = "name")
	WebElement enterName;
  
	public void enter_name(String Name)
	{
		enterName.sendKeys(Name);
	}
	
	@FindBy(xpath = "//*[@data-qa='signup-email']")
	WebElement enterEmail;
  
	public void enter_email(String Email_Address)
	{
		enterEmail.sendKeys(Email_Address);
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
	  
	public void enter_password(String Password)
	{
		enterPassword.sendKeys(Password);
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
	  
	public void enter_firstname(String First_name)
	{
		enterFirstName.sendKeys(First_name);
	}
	
	@FindBy(id = "last_name")
	WebElement enterLastName;
	  
	public void enter_lastname(String Last_name)
	{
		enterLastName.sendKeys(Last_name);
	}
	
	@FindBy(id = "company")
	WebElement enterCompany;
	  
	public void enter_company(String Company)
	{
		enterCompany.sendKeys(Company);
	}
	
	@FindBy(id = "address1")
	WebElement enterAddress;
	  
	public void enter_address(String Address)
	{
		enterAddress.sendKeys(Address);
	}
	
	@FindBy(id = "state")
	WebElement enterState;
	  
	public void enter_state(String State)
	{
		enterState.sendKeys(State);
	}
	
	@FindBy(id = "city")
	WebElement enterCity;
	  
	public void enter_city(String City)
	{
		enterCity.sendKeys(City);
	}
	
	@FindBy(id = "zipcode")
	WebElement enterZipcode;
	  
	public void enter_zipcode(String Zipcode)
	{
		enterZipcode.sendKeys(Zipcode);
	}
	
	@FindBy(id = "mobile_number")
	WebElement enterMobileNumber;
	  
	public void enter_mobilenumber(String Mobile_Number)
	{
		enterMobileNumber.sendKeys(Mobile_Number);
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
