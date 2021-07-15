package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resources {
	
	WebDriver driver;
	  String baseUrl = "https://saucelabs.com";
	    
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
	    @When("user clicks on Resources")
		public void user_should_be_view_Resources() throws InterruptedException{
			driver.findElement(By.linkText("Resources")).click();
			Thread.sleep(5000);
			System.out.println("Resources");
		}
		@Then("user should able to view Resources options")
		public void user_should_to_view_Resources_options_(){	
		System.out.println("user view Resources options");
		}
		@When("user clicks on Sauce Labs Blog")
		public void user_should_be_view_Sauce_Labs_Blog() throws InterruptedException{
			driver.findElement(By.linkText("Sauce Labs Blog page")).click();
			Thread.sleep(5000);
			System.out.println("user on Sauce Labs Blog");
		}
		@Then("user should able to view Sauce Labs Blog page")
		public void user_should_to_view_Sauce_Labs_Blog_page_(){
		System.out.println("user sloud be on Sauce Labs Blog page");
		}
		@When("user clicks on Resource Center")
		public void user_should_be_view_Resource_Center_() throws InterruptedException{
			driver.findElement(By.linkText("Resource Center")).click();
			Thread.sleep(5000);
			System.out.println("user on Resource Center");
		}
		@Then("user should able to view Resource Center page")
		public void user_should_to_view_Resource_Center_page_(){
		System.out.println("user should be on Resource Center page");
		}
	    @When("user clicks on Articles")
		public void user_should_be_view_Articles() throws InterruptedException{
			driver.findElement(By.linkText("Articles")).click();
			Thread.sleep(5000);
			System.out.println("user on Articles");
	    }
	    @Then("user should able to view Articles page")
		public void user_should_to_view_Articles(){	
		System.out.println("user should be on Articles page");
		}
	    @When("user clicks on Videos")
		public void user_should_be_view_Videos() throws InterruptedException{
			driver.findElement(By.linkText("Videos")).click();
			Thread.sleep(5000);
			System.out.println("user on Videos");
	    }
	    @Then("user should able to view Videos page")
		public void user_should_to_view_Videos(){	
		System.out.println("user should be on Videos page");
		}
	    @When("user clicks on Webinars")
		public void user_should_be_view_Webinars() throws InterruptedException{
			driver.findElement(By.linkText("Webinars")).click();
			Thread.sleep(5000);
			System.out.println("user on Webinars");
	    }
	    @Then("user should able to view Webinars page")
		public void user_should_to_view_Webinars(){
		System.out.println("user should be on Webinars page");
		}
	    @When("user clicks on Studies")
		public void user_should_be_view_Studies() throws InterruptedException{
			driver.findElement(By.linkText("Studies")).click();
			Thread.sleep(5000);
			System.out.println("user on Studies");
	    }
	    @Then("user should able to Studies page")
		public void user_should_to_view_Studies(){
		System.out.println("user should be on Studies page");
		}
	    @When("user clicks on White Papers")
		public void user_should_be_view_White_Papers() throws InterruptedException{
			driver.findElement(By.linkText("White Papers")).click();
			Thread.sleep(5000);
			System.out.println("user on White Papers");
	    }
	    @Then("user should able to White Papers")
		public void user_should_to_view_White_Papers(){
		System.out.println("user should be on White Papers page");
		}
	    @When("user clicks on Data Sheets")
		public void user_should_be_view_Data_Sheets() throws InterruptedException{
		driver.findElement(By.linkText("Data Sheetss")).click();
		Thread.sleep(5000);
		System.out.println("user on Data Sheets");
	    }
	    @Then("user should able to Data Sheets")
		public void user_should_to_view_Data_Sheets(){	
		System.out.println("user should be on Data Sheets page");
		}
	    @When("user clicks on  Documentation")
		public void user_should_be_view_Documentation() throws InterruptedException{
		driver.findElement(By.linkText(" Documentation")).click();
		Thread.sleep(5000);
		System.out.println("user on  Documentation");
	    }
	    @Then("user should able to Documentation")
	    public void user_should_to_view_Documentations(){
		System.out.println("user should be on Documentation page");
			}
	    @When("user clicks on  Knowledge Base")
		public void user_should_be_view_Knowledge_Base() throws InterruptedException{
		driver.findElement(By.linkText("Knowledge Base")).click();
		Thread.sleep(5000);
		System.out.println("user on Knowledge Base");
	    }
	    @Then("user should able to Knowledge Base")
	    public void user_should_to_view_Knowledge_Base(){
		System.out.println("user should be on Knowledge Base page");
			}
	    @When("user clicks on  Our Experts")
		public void user_should_be_view_Our_Experts() throws InterruptedException{
		driver.findElement(By.linkText("Our Experts")).click();
		Thread.sleep(5000);
		System.out.println("user on Our Experts");
	    }
	    @Then("user should able to Our Experts")
	    public void user_should_to_view_Our_Experts(){	
		System.out.println("user should be onr Experts page");
			}
	    @When("user clicks on Training")
		public void user_should_be_view_Training() throws InterruptedException{
		driver.findElement(By.linkText("Training")).click();
		Thread.sleep(5000);
		System.out.println("user on Training");
	    }
	    @Then("user should able to Training")
	    public void user_should_to_view_Training(){
		System.out.println("user should be on Trainings page");
			}
	    @When("user clicks on Community")
		public void user_should_be_view_Community() throws InterruptedException{
		driver.findElement(By.linkText("Community")).click();
		Thread.sleep(5000);
		System.out.println("user on Community");
	    }
	    @Then("user should able to Community")
	    public void user_should_to_view_Community(){	
		System.out.println("user should be on Community page");
			}
	    @When("user clicks on Join Secret Sauce")
		public void user_should_be_view_Join_Secret_Sauce() throws InterruptedException{
		driver.findElement(By.linkText("Join Secret Sauce")).click();
		Thread.sleep(5000);
		System.out.println("user on Join Secret Sauce");
	    }
	    @Then("user should able to Join Secret Sauce")
	    public void user_should_to_view_Join_ecret_Sauce(){
		System.out.println("user should be on Join Secret Sauce page");
			}
	    @When("user clicks on Events")
		public void user_should_be_view_Events() throws InterruptedException{
		driver.findElement(By.linkText("Events")).click();
		Thread.sleep(5000);
		System.out.println("user on Events");
	    }
	    @Then("user should able to Eventse")
	    public void user_should_able_to_view_Events(){
		System.out.println("user should be on Events page");
			}
	    @When("user clicks on Selenium")
		public void user_should_be_view_Selenium() throws InterruptedException{
		driver.findElement(By.linkText("Selenium")).click();
		Thread.sleep(5000);
		System.out.println("user on Selenium");
	    }
	    @Then("user should able to Seleniume")
	    public void user_should_to_view_Selenium(){
		System.out.println("user should be on Selenium page");
			}
	    @When("user clicks on Appium")
		public void user_should_on_Appium() throws InterruptedException{
		driver.findElement(By.linkText("Appium")).click();
		Thread.sleep(5000);
		System.out.println("user on Appium");
	    }
	    @Then("user should able to Appium")
	    public void user_should_to_view_Appium(){
		System.out.println("user should be on Appium page");
			}
	}

	


