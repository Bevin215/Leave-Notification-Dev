package basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	String browser = "edge";
	
	String url = "https://lkmdemoaut.accenture.com/AccenSportz/#/";
	

	public void openBrowser() {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		driver.get(url);
	}
}
