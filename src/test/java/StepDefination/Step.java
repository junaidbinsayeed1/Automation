package StepDefination;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageObject.ContactusPage;
import PageObject.HeaderPage;
import PageObject.ProductPage;
import PageObject.SignupPage;
import io.cucumber.java.en.*;


public class Step extends Base
{

	@Given("Launch browser")
	public void launch_browser() 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Navigate to google homepage")
	public void navigate_to_google_homepage() 
	{
		driver.get("https://www.google.com/");
	}

	@Then("Type AUTOMATION EXCERCISE text in the search bar and press enter")
	public void type_automation_exercise_text_in_the_search_bar_and_press_enter() 
	{
		spage = new SignupPage(driver);
	    driver.findElement(By.id("APjFqb")).sendKeys("automation exercise");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Click on the homepage link")
	public void click_the_homepage_link() 
	{
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	}

	@When("User verify that home page is visible successfully")
	public void user_verify_that_home_page_is_visible_successfully() 
	{
		Assert.assertEquals(driver.getTitle(),"Automation Exercise");
	}

	@Then("Click on SIGNUP \\/ LOGIN button")
	public void click_on_signup_login_button() 
	{
		spage.click_signup();
	}

	@Then("Verify NEW USER SIGNUP! text is visible")
	public void verify_new_user_signup_text_is_visible() 
	{
		Assert.assertTrue(driver.findElement(By.className("signup-form")).isDisplayed());
	}

	@Then("^Enter name as (.*) and email address as (.*)$")
	public void enter_name_and_email(String Name, String Email) 
	{
		spage.enter_name(Name);
		spage.enter_email(Email);
	}

	@Then("Click on SIGNUP button")
	public void click_signup_button() 
	{
		spage.click_signup_button();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION text is visible")
	public void verify_that_enter_account_information_text_is_visible() 
	{
		Assert.assertEquals(driver.findElement(By.cssSelector("h2.title.text-center")).getText(),"ENTER ACCOUNT INFORMATION");
	}

	@Then("^Fill details: TITLE, PASSWORD as (.*) and DATE OF BIRTH$")
	public void fill_details_title_password_and_date_of_birth(String Password) 
	{
		 spage.click_title_button();
		 spage.enter_password(Password);
		 spage.select_day();
		 spage.select_month();
		 spage.select_year();
		    
		 Select day = new Select (driver.findElement(By.id("days")));
		 day.selectByValue("10");
		    
		 Select month = new Select (driver.findElement(By.id("months")));
		 month.selectByValue("10");
		    
		 Select year = new Select (driver.findElement(By.id("years")));
		 year.selectByValue("2010");
	}

	@Then("^Fill details: (.*),(.*),(.*),(.*)$")
	public void fill_details(String First_name, String Last_name, String Company, String Address) 
	{
		 spage.enter_firstname(First_name);
		 spage.enter_lastname(Last_name);
		 spage.enter_company(Company);
		 spage.enter_address(Address);
	}
	
	@Then("^Select COUNTRY and Fill details: (.*),(.*),(.*),(.*)$")
	public void select_country_fill_details(String State, String City, String Zipcode, String Mobile_Number) 
	{
		Select country = new Select (driver.findElement(By.id("country")));
		country.selectByValue("Australia");
		spage.enter_state(State);
		spage.enter_city(City);
		spage.enter_zipcode(Zipcode);
		spage.enter_mobilenumber(Mobile_Number);
	}

	@Then("Click on CREATE ACCOUNT button")
	public void click_create_account_button() 
	{
		 spage.click_on_create_button();
	}

	@Then("Verify that ACCOUNT CREATED! text is visible")
	public void verify_that_account_created_text_is_visible() 
	{
		Assert.assertEquals(driver.findElement(By.cssSelector("h2.title.text-center")).getText(),"ACCOUNT CREATED!");
	}

	@Then("Click on CONTINUE button")
	public void click_continue_button() 
	{
		spage.click_continue();
	}

	@Then("^Verify that Logged in as (.*) is visible$")
	public void verify_that_logged_in_as_is_visible(String Name) 
	{
		Assert.assertTrue(driver.findElement(By.cssSelector("i.fa.fa-home")).getAttribute(Name), true);
	}

	@Then("Click on DELETE ACCOUNT button")
	public void click_delete_account_button() 
	{
		spage.click_on_delete_account_button();
	}

	@Then("Verify that ACCOUNT DELETED! text is visible and click on CONTINUE button")
	public void verify_that_account_deleted_text_is_visible_and_click_continue_button() 
	{
		Assert.assertEquals(driver.findElement(By.cssSelector("h2.title.text-center")).getText(),"ACCOUNT DELETED!");
		spage.click_continue();
	}
	
	
//**********************************************************CONTACT US FEATURE*******************************************************************************//

		
	@When("User click on Contact Us button")
	public void click_on_contact_us_button()
	{
		cpage = new ContactusPage(driver);
		cpage.click_contact_us();
	}
	
	@Then("User verify GET IN TOUCH is visible")
	public void verify_get_in_touch_is_visible() 
	{
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Get In Touch']")).getText(),"GET IN TOUCH");
	}	

	@Then("^Enter (.*),(.*),(.*) and (.*)$")
	public void enter_details(String Name, String Email, String Subject, String Message) 
	{
		cpage.enter_name_again(Name);
		cpage.enter_email_again(Email);
		cpage.enter_subject(Subject);
		cpage.enter_message(Message);
	}
	
	@Then("Click on SUBMIT button")
	public void click_on_submit_button() 
	{
	    cpage.click_submit();
	}
	
	@Then("Click on OK button on alert box")
	public void click_on_ok_button_on_alert_box() 
	{
	   driver.switchTo().alert().accept();
	}
	
	@Then("Verify success message SUCCESS! YOUR DETAILS HAVE BEEN SUBMITTED SUCCESSFULLY is visible")
	public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() 
	{
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Success! Your details have been submitted successfully.']")).getText(),"Success! Your details have been submitted successfully.");
	}
	
	@Then("Click on HOME button and verify that user landed to home page successfully")
	public void click_on_home_button_and_verify_that_user_landed_to_home_page_successfully() 
	{
	  cpage.click_home_button();
	  driver.getTitle();
	}
	
	@And("Close the browser")
	public void close_the_browser() 
	{
	    driver.close();
	}
	
	
//**********************************************************HEADER BUTTONS FEATURE*******************************************************************************//

	
	@Then("User clicks on PRODUCT button")
	public void user_clicks_on_product_button() 
	{
		hpage = new HeaderPage(driver);
		hpage.click_on_products();
	}

	@Then("Verify user is navigated to product page successfully")
	public void verify_user_is_navigated_to_product_page_successfully()
	{
		Assert.assertEquals(driver.getTitle(),"Automation Exercise - All Products");
	}

	@Then("User clicks on CART button")
	public void user_clicks_on_cart_button()
	{
		hpage.clik_on_cart();
	}

	@Then("Verify user is navigated to cart page successfully")
	public void verify_user_is_navigated_to_cart_page_successfully() 
	{
		Assert.assertEquals(driver.getTitle(),"Automation Exercise - Checkout");
	}

	@Then("User clicks on TEST CASES button")
	public void user_clicks_on_test_cases_button() 
	{
		hpage.clik_on_test_cases();
	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() 
	{
		Assert.assertEquals(driver.getTitle(),"Automation Practice Website for UI Testing - Test Cases");
	}

	@Then("User clicks on API TESTING button")
	public void user_clicks_on_api_button() 
	{
		hpage.clik_on_api();
	}

	@Then("Verify user is navigated to api page successfully")
	public void verify_user_is_navigated_to_api_page_successfully() 
	{
		Assert.assertEquals(driver.getTitle(),"Automation Practice for API Testing");
	}

	@Then("User clicks on VIDEO TUTORIALS button")
	public void user_clicks_on_video_tutorials_button() 
	{
		hpage.clik_on_video_tutorials();
	}

	@Then("Verify user is navigated to video tutorials page successfully")
	public void verify_user_is_navigated_to_video_tutorials_page_successfully() 
	{
		Assert.assertEquals(driver.getTitle(),"AutomationExercise - YouTube");
	}

	
//**********************************************************CONTACT US FEATURE*******************************************************************************//

	
	@When("User click on PRODUCT button")
	public void user_click_on_product_button() 
	{
		prdpage = new ProductPage(driver);
		prdpage.click_on_products();
	}
	
	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() 
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");
	}

	@When("The products list is visible")
	public void the_products_list_is_visible()
	{
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='All Products']")).getText(),"ALL PRODUCTS");
		List<WebElement> listofproducts = driver.findElements(By.className("features_items"));
		System.out.println(listofproducts.size());
	}

	@Then("Click on VIEW PRODUCT of second product")
	public void click_on_view_product_of_second_product() 
	{
	   prdpage.click_on_view_product_button();
	}

	@When("User is landed to product detail page")
	public void user_is_landed_to_product_detail_page() 
	{
		Assert.assertEquals(driver.getTitle(),"Automation Exercise - Product Details");
	}

	@Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
	public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() 
	{
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Men Tshirt']")).getText(),"Men Tshirt");
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Category: Men > Tshirts']")).getText(),"Category: Men > Tshirts");
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Rs. 400']")).getText(),"Rs. 400");
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()=' In Stock']")).getText(),"Availability: In Stock");
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()=' New']")).getText(),"Condition: New");
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()=' H&M']")).getText(),"Brand: H&M");
	}


}

