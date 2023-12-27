package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageObject.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps
{
	WebDriver driver;
	SignupPage page;
		

	
	@Given("user needs to open the browser")
	public void user_needs_to_open_the_browser() 
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\Browser Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
	}
	
	@When("user navigates to google homepage")
	public void user_navigates_to_google_homepage() 
	{
	  driver.get("https://www.google.com/");
	}

	@Then("user needs to type automation exercise in the search bar and press enter")
	public void user_needs_to_type_automation_exercise() 
	{
		page = new SignupPage(driver);
	    driver.findElement(By.id("APjFqb")).sendKeys("automation exercise");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("click the homepage link")
	public void click_the_homepage_link() 
	{
	   page.click_homepage_link();
	}

	@Then("user needs to select signup link")
	public void user_needs_to_select_signup_link() 
	{
		page.click_signup();
	}

	@Then("^user enters (.*) and (.*)$")
	public void user_enters_name_and_email(String name, String email) 
	{
	   page.enter_name(name);
	   page.enter_email(email);
	}
	
	@Then("click on signup button")
	public void click_on_signup_button() 
	{
	    page.click_signup_button();
	}

	@Then("user clicks on title")
	public void user_clicks_on_title() 
	{
	    page.click_title_button();
	}
	
	@Then("^user needs to create password (.*)$")
	public void user_needs_to_create_password(String password)
	{
	    page.enter_password(password);
	}
	
	@Then("user needs to select date of birth")
	public void user_needs_to_select_date_of_birth() 
	{
	    page.select_day();
	    page.select_month();
	    page.select_year();
	    
	    Select day = new Select (driver.findElement(By.id("days")));
	    day.selectByValue("10");
	    
	    Select month = new Select (driver.findElement(By.id("months")));
	    month.selectByValue("10");
	    
	    Select year = new Select (driver.findElement(By.id("years")));
	    year.selectByValue("2010");
		    
	}
	
	@Then("^user enter first name as (.*)$")
	public void user_needs_to_enter_first_name(String firstname) 
	{
	    page.enter_firstname(firstname);
	}
	
	@Then("^user enter last name as (.*)$")
	public void user_needs_to_enter_last_name(String lastname) 
	{
	    page.enter_lastname(lastname);
	}
	
	@Then("^user enter address as (.*)$")
	public void user_needs_to_enter_address(String address) 
	{
	    page.enter_address(address);
	}
	
	@Then("^user enter state as (.*)$")
	public void user_needs_to_enter_state(String state) 
	{
	    page.enter_state(state);
	}
	
	@Then("^user enter city as (.*)$")
	public void user_needs_to_enter_city(String city) 
	{
	    page.enter_city(city);
	}
	
	@Then("^user enter zipcode as (.*)$")
	public void user_needs_to_enter_zipcode(String zipcode) 
	{
	    page.enter_zipcode(zipcode);
	}
	
	@Then("^user enter mobile number as (.*)$")
	public void user_needs_to_enter_mobile_number(String number) 
	{
	    page.enter_mobilenumber(number);
	}
	
	@Then("click on create account button")
	public void click_on_create_account_button() 
	{
	    page.click_on_create_button();
	}
	
	@Then("verify account created message")
	public void verify_account_created_message() 
	{
		Assert.assertEquals(driver.findElement(By.cssSelector("h2.title.text-center")).getText(),"ACCOUNT CREATED!");
	}
	
	@Then("click on continue button")
	public void click_on_continue_button() 
	{
	    page.click_continue();
	}
	
	@Then("click on delete account button")
	public void click_on_delete_account_button() 
	{
	    page.click_on_delete_account_button();
	}
	
	@Then("verify account deleted message")
	public void verify_account_deleted_message() 
	{
		Assert.assertEquals(driver.findElement(By.cssSelector("h2.title.text-center")).getText(),"ACCOUNT DELETED!");
	}
	
	@Then("click continue")
	public void click_continue() 
	{
	    page.click_continue();
	}
	
	@Then("close the browser")
	public void close_the_browser() 
	{
	    driver.quit();
	}
	
}

