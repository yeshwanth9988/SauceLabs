package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact {
	public static WebDriver driver;
    String baseUrl = "https://saucelabs.com/";
    
    @Given("user should be on About home Page")
   	public void the_user_should_be_on_About_home_Page(){
   	
    
    
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);
		System.out.println("The user is on About home page");
		
    
    }
    @When("user click on Contact")
	public void user_clicks_on_Contact_List() throws InterruptedException{
	driver.findElement(By.linkText("Contact")).click();
	Thread.sleep(5000);
	System.out.println("user on Contact List");
    }
    @Then("user should view Contact List")
	public void user_should_view_Contact_List(){
		System.out.println("user should be able to view Contact options");
		
	}
    @When("user clicks on Contact Sales")
	public void user_clicks_on_Contact_Sales() throws InterruptedException
	{
		driver.findElement(By.linkText("Contact Sales")).click();
		Thread.sleep(5000);
		System.out.println("user on Contact Sales");
	}
	@Then("user should be on Contact Sales page")
	public void user_should_be_on_Contact_Sales_page()
	{

		System.out.println("user on Contact Sales page");
	}
	@When("user click on General Inquiries")
	public void user_clicks_on_General_Inquiries() throws InterruptedException
	{
		driver.findElement(By.linkText("General Inquiries")).click();
		Thread.sleep(5000);
		System.out.println("user on General Inquiries");
	}
	@Then("user should be on General Inquiriess page")
	public void user_should_be_on_General_Inquiries_page()
	{
		System.out.println("user on General Inquiries page");
	}
	@When("user click on Contact Support")
	public void user_clicks_on_Contact_Support() throws InterruptedException
	{
		driver.findElement(By.linkText("Contact Support")).click();
		Thread.sleep(5000);
		System.out.println("user on Contact Support");
	}
	@Then("user should be on Contact Support")
	public void user_should_be_on_Contact_Support_page()
	{
		System.out.println("user on Contact Support page");
	}
	@When("user click on Sauce Community")
	public void user_clicks_on_Sauce_Community() throws InterruptedException
	{
		driver.findElement(By.linkText("Sauce Community")).click();
		Thread.sleep(5000);
		System.out.println("user on Sauce Community");
		}
	@Then("user should be on Sauce Community")
	public void user_should_be_on_Sauce_Community_page()
	{
		
		System.out.println("user on Sauce Community page");
	}
	@Then("user closes the browser")
	public void user_closes_the_browser()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}
	
}

  
