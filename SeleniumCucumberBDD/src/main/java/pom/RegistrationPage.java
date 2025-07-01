package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import basepack.BaseClass;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage() {
		super.openBrowser();  // Ensures browser opens
		//this.driver = BaseClass.getDriver();  // Assign the initialized driver
	}
	
	By fname = By.cssSelector("input#firstname");
	By lname = By.id("mat-input-1");
	By DOB = By.id("Date");
	By num = By.id("phonenumber");
	By email = By.id("mat-input-4");
	By male = By.id("mat-radio-2-input");
	By female = By.id("mat-radio-3-input");
	By selectAge = By.id("mat-mdc-form-field-label-10");
	By ageop1 = By.id("one");
	By ageop2 = By.id("two");
	By ageop3 = By.id("three");
	By ageop4 = By.id("four");
	By weight  = By.cssSelector("input[max='99']");
	By sports = By.id("mat-mdc-form-field-label-12");
	By sportsop1 = By.id("mat-option-4");
	By sportsop2 = By.id("mat-option-5");
	By sportsop3 = By.id("mat-option-6");
	By sportsop4 = By.id("mat-option-7");
	By sportsop5 = By.id("mat-option-8");
	By choosefile = By.xpath("//input[@type='file']");
	By address = By.id("mat-input-5");
	By zipcode = By.id("mat-input-6");
	By checkbox = By.xpath("//input[@id='mat-mdc-checkbox-1-input']");
	By submit = By.xpath("//button[@name='submitbutton']");
	
	public void enter_fname(String name)
	{
		driver.findElement(fname).sendKeys(name);
	}
	
	public void enter_lname(String name)
	{
		driver.findElement(lname).sendKeys(name);
	}
	
	public void enter_DOB(String date)
	{
		driver.findElement(DOB).sendKeys(date);
	}
	
	public void enter_number(String number) {
		driver.findElement(num).sendKeys(number);
	}
	
	public void enter_Email(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void select_Gender_Male()
	{
		driver.findElement(male).click();
	}
	
	public void select_Gender_Female() {
		driver.findElement(female).click();
	}
	
	public void select_Age() {
		driver.findElement(selectAge).click();
	}
	
	public void select_1_25()
	{
		driver.findElement(ageop1).click();
	}
	
	public void select_26_50()
	{
		driver.findElement(ageop2).click();
	}
	
	public void select_51_75() {
		driver.findElement(ageop3).click();
	}
	
	public void select_76_100() {
		driver.findElement(ageop4).click();
	}
	
	public void select_weight() {
		driver.findElement(weight).click();
	}
	
	public void select_Sports () {
		driver.findElement(sports).click();
	}
	
	public void select_Hockey () {
		driver.findElement(sportsop1).click();
	}
	
	public void select_Cricket () {
		driver.findElement(sportsop2).click();
	}
	
	public void select_FootBall() {
		driver.findElement(sportsop3).click();
	}
	
	public void select_BasketBall () {
		driver.findElement(sportsop4).click();
	}
	
	public void select_Tennis () {
		driver.findElement(sportsop5).click();
	}
	
	public void upload_File (String path) {
		driver.findElement(choosefile).sendKeys(path);;
	}
	
	public void Address (String add) {
		driver.findElement(address).sendKeys(add);
	}
	
	public void Zipcode (String code) {
		driver.findElement(zipcode).sendKeys(code);
	}
	
	public void click_CheckBox () {
		WebElement accept = driver.findElement(checkbox);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", accept);
	}
	
	public void click_Submit () {
		WebElement sub = driver.findElement(submit);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", sub);
	}

}
