//package StepDefinition;
//
//import pom.RegistrationPage;
//
//import org.openqa.selenium.By;
//
//import basepack.BaseClass;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class RegistrationPage_Step extends BaseClass
//{
//	RegistrationPage page = new RegistrationPage();
//	
//	@Before
//	public void before() {
//		openBrowser();
//	}
//	@After
//	public void after() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.quit();
//	}
//	
//	
//	
//	@Given("user is on registration page")
//	public void user_is_on_registration_page() {
//	   driver.findElement(By.id("playerregistrationlink")).click();
//	}
//
//	@When("the user enters first name")
//	public void the_user_enters_first_name() {
//	   page.enter_fname("Sathwik");
//	}
//
//	@When("the user enters last name")
//	public void the_user_enters_last_name() {
//	    page.enter_lname("B");
//	}
//
//	@When("the user enters date of birth")
//	public void the_user_enters_date_of_birth() {
//	   page.enter_DOB("01/01/2003");
//	}
//
//	@When("the user enters phone number")
//	public void the_user_enters_phone_number() {
//	    page.enter_number("7676444993");
//	}
//
//	@When("the user enters email")
//	public void the_user_enters_email() {
//	    page.enter_Email("Sathwik1289@gmail.com");
//	}
//
//	@When("the user selects gender")
//	public void the_user_selects_gender() {
//		page.select_Gender_Male();
//	}
//
//	@When("the user selects age group")
//	public void the_user_selects_age_group() {
//	   page.select_Age();
//	   page.select_1_25();
//	}
//
//	@When("the user enters weight")
//	public void the_user_enters_weight() {
//		 page.select_weight();
//	}
//
//	@When("the user selects sports")
//	public void the_user_selects_sports() {
//		page.select_Sports();
//		page.select_Cricket();
//		}
//
//	@When("the user uploads file")
//	public void the_user_uploads_file() {
//	    page.upload_File("C:\\Users\\abhi.sathwik.bathala\\Downloads\\Screenshot_1-4-2025_94715_geniustutorshiftleft.accenture.com.jpeg");}
//
//	@When("the user enters address")
//	public void the_user_enters_address() {
//	    page.Address("Nellore");
//	}
//
//	@When("the user enters zipcode")
//	public void the_user_enters_zipcode() {
//	    page.Zipcode("524004");
//	}
//
//	@When("the user checks the agreement checkbox")
//	public void the_user_checks_the_agreement_checkbox() {
//	    page.click_CheckBox();
//	}
//
//	@When("the user clicks the submit button")
//	public void the_user_clicks_the_submit_button() {
//	    page.click_Submit();
//	}
//
//	@Then("the user is Registered")
//	public void the_user_is_registered() {
//	   if(driver.getPageSource().contains("Registration Successfull !"))
//		   System.out.println("**User Registration Sucessfully**");
//	   else
//		   System.out.println("Registration Unsucessful!");
//
//
//
//}
//}