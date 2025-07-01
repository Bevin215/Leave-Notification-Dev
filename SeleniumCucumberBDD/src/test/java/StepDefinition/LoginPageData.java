//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginPageData {
//	WebDriver driver;
//	@Before
//	public void before() {
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//	}
//	@After
//	public void after() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.quit();
//	}
//
//@Given("User is on login page")
//public void user_is_on_login_page() {
//	
//	driver.get("https://www.saucedemo.com");
//    
//}
//
//@When("User enters {string} and {string}")
//public void user_enters_and(String username, String password) {
//	driver.findElement(By.id("user-name")).sendKeys(username);
//	driver.findElement(By.id("password")).sendKeys(password);
//   
//}
//
//@When("User clicks on login button")
//public void user_clicks_login_button() {
//	driver.findElement(By.id("login-button")).click();   
//}
//
//
//@Then("User may login or may get error message")
//public void user_may_login_or_may_get_error_message() {
//	
//	String currentURL = driver.getCurrentUrl();
//	if(currentURL.equals("https://www.saucedemo.com/inventory.html"))
//	System.out.println("User logged in successfully");
//	
//	else if(driver.getPageSource().contains("Epic sadface: Username and password do not match any user in this service"))
//		System.out.println("User received error message sucessfully ");
//	else
//		System.out.println("Something went wrong ");
//
//
//    
//}
//
//
//}
