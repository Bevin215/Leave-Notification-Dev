package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	
	@After
	public void after() {
		driver.quit();
	}

	

@Given("user is on Login page")
public void user_is_on_login_page() {
	

	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	username=driver.findElement(By.id("user-name"));
	password= driver.findElement(By.id("password"));

    
}

@When("User enter valid username and password")
public void user_enter_valid_username_and_password() {

	username.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
	
}

@When("User enter invalid username and password")
public void user_enter_invalid_username_and_password() {

	username.sendKeys("standarduser");
	password.sendKeys("secretsauce");
    
}

@When("User enter invalid username and valid password")
public void user_enter_invalid_username_and_valid_password() {

	username.sendKeys("standarduser");
	password.sendKeys("secret_sauce");	
}
@When("User enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password() {

	username.sendKeys("standard_user");
	password.sendKeys("secretsauce");
}
@When("User click on login button")
public void user_click_on_login_button() {
	driver.findElement(By.id("login-button")).click();   
}
@Then("User landed on homepage")
public void user_landed_on_homepage() {
	String currentURL = driver.getCurrentUrl();
	if(currentURL.equals("https://www.saucedemo.com/inventory.html"))
	System.out.println("User logged in successfully");
	else
		System.out.println("User failed to login");
}

@Then("User gets error message")
public void user_gets_error_message() {
	if(driver.getPageSource().contains("Epic sadface: Username and password do not match any user in this service"))
		System.out.println("User recievd error message succesfully");
	else
		System.out.println("User is unable to recieve error message ");

}

}
