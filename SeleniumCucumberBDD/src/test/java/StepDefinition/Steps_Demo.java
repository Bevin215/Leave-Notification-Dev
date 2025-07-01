//package StepDefinition;
// 
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
// 
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
// 
//public class Steps_Demo {
//	
//	WebDriver driver;
//	
//	@Given("User opens browser")
//	public void user_opens_browser() {
//		
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//	    
//	}
// 
//	@When("User launch url")
//	public void user_launch_url() {
//		
//		driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
//	    
//	}
// 
//	@Then("User is on HomePage")
//	public void user_is_on_home_page() {
//	   String title = driver.getTitle();
//	   if(title.equals("accenSportz")) {
//		   System.out.println("User landed on homepage successfully");
//	   }
//	   else
//		   System.out.println("User landed on homepage successfully");
//	}
// 
//}