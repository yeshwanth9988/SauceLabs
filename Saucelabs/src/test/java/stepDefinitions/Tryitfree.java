package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CompanyList;

public class Tryitfree {
	
	
	
	public WebDriver driver;
	 String baseUrl = "https://saucelabs.com/";
	  pom.TryitfreeList cp;
	 

	@Before
	 public void TryitfreeList() {
		 
		 cp = new pom.TryitfreeList(driver);
	 }

		@Given("user should be on About home Page")
		public void user_should_be_on_About_home_Page()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			System.out.println("The user is on About home page");
		}
		 @When("user click on Try it free")
		 public void user_on_Try_it_free(){
			 driver.findElement(By.linkText("Try it free")).click();
			 System.out.println("user on Try it free page");
			 
		 }
		 @Then("user on Try it free page")
		 public void user_on_Try_it_free_page(){
			 System.out.println("user on Try it free page");
		 }
		 @When("user click on Sign up with Google")
		 public void user_click_on_Sign_up_with_Google(){
				
			 driver.findElement(By.linkText("Sign up with Google")).click();
			 System.out.println("user on trail page of sauce labs");
		 
		}
		
		 @When("user click on Sign up with GitHub")
		 public void user_click_on_Sign_up_with_GitHub(){
				
			 driver.findElement(By.linkText("Sign up with GitHub")).click();
			 System.out.println("user on trail page of sauce labs");
		 
		}
		 @When("user click on Sign up with Email")
		 public void user_click_on_Sign_up_with_Email(){
				
			 driver.findElement(By.linkText("Sign up with Email")).click();
			 System.out.println("user on trail page of sauce labs");
		 
		}
		 @Then("user should be on sauce labs free trial Page")
		 public void user_should_be_on_sauce_labs_free_trial_Page(){
			 System.out.println("user on trial page");
			 
		 }
		@Then("user close the browser")
		public void user_close_the_browser(){
			driver.quit();
			System.out.println("browser closed");
		}


}
