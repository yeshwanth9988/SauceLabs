package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CompanyList;

public class Company {

	 WebDriver driver;
    String baseUrl = "https://saucelabs.com";
    CompanyList cp;
    
  @Before
   public void CompanyList()
   {
	  cp = new CompanyList(driver);
   }
    
 

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
     @When("user click on Company")
     public void user_click_on_Company() {
	    driver.findElement(By.xpath("//a[@class=\"link\"]")).click();
	   
	    System.out.println("user on Company");
	    
   }
     @Then("user should be able to view Comapany List")
     public void user_should_be_able_to_view_Comapany_List() {
    	 System.out.println("user should be able to view Comapany List");
     }

    @When("user click on About US")
    public void user_click_on_About_us() {
    	driver.findElement(By.linkText("About Us")).click();
    	
    	System.out.println("user on About Us");
    }

    @Then("user Should be on About Us page")
    public void user_Should_be_on_About_Us_page() {
    	System.out.println("user should be on About Us page");
    }
    
    @When("user click on Our Team")
    public void user_click_on_Our_Team() {
    	driver.findElement(By.linkText("Our Team")).click();
    	
    	System.out.println("user on Our Team");
    }
    @Then("user should be on Our Team page")
    public void user_should_be_on_Our_Team() {
    	System.out.println("user should be on Our page");
    }
    @When("user click on Careers")
    public void user_click_on_Careers() {
    	driver.findElement(By.linkText("Careers"));
    	
    	System.out.println("user on Careers");
    }
    @Then("user should be on Careers page")
    public void user_should_be_on_Careers_page() {
    	System.out.println("user should be on Careers page");
    }
    @When("user click on Security")
    public void user_click_on_Security() {
    	driver.findElement(By.linkText("Security")).click();
    	
    	System.out.println("user o security");
    }
    @Then("user should be on Security page")
    public void user_should_be_on_security_page() {
    	System.out.println("user should be on Security page");
    }
    
    @When("user click on News")
    public void user_click_on_News() {
    	driver.findElement(By.linkText("News")).click();
    	
    	System.out.println("user on News");
    }
    @Then("user should be on News page")
    public void user_should_be_on_Security_page() {
    	System.out.println("user should be on Security page");
    }
    @When("user click on Partner")
    public void user_click_on_Partner() {
    	driver.findElement(By.linkText("Partner")).click();
    	
    	System.out.println("user on Partner");
    	
    }
    @Then("user should be on Partner page")
    public void user_should_be_on_Partner_page() {
    	System.out.println("user should be on Partner page");
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
    	System.out.println("Browser closed");
    }
    
    
    
}
