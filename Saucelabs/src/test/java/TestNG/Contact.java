package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ContactList;

public class Contact {

	String url = "https://saucelabs.com/";
	String expectedTitle1 = "Contact";
	String expectedTitle2 = "ContactSales";
	String expectedTitle3 = "GeneralInquiries";
	String expectedTitle4 = "ContactSupport";
	String expectedTitle5 = "SauceCommunity";
	String actualTitle1 = "Contact";
	String actualTitle2 = "ContactSales";
	String actualTitle3 = "GeneralInquiries";
	String actualTitle4 = "ContactSupport";
	String actualTitle5 = "SauceCommunity";
	WebDriver driver;
    ContactList cp;
    public WebElement Company;
    public JavascriptExecutor js;
   
    @Test(priority = 1)
    public void user_click_on_Contact() {
 	   
 	   driver.findElement(By.linkText("Contact")).click();
 	   System.out.println("user on Contact");
 	   Assert.assertEquals(actualTitle1, expectedTitle1);
    }
    
    @Test(priority = 2)
    public void user_click_on_ContactSales() {
 	   driver.findElement(By.linkText("Contact Sales")).click();
 	   System.out.println("user on Contact Sales page");
 	   Assert.assertEquals(actualTitle2, expectedTitle2);
    }
    @Test(priority = 3)
    
    public void user_click_on_Our_Team() {
 	   driver.findElement(By.linkText("GeneralInquiries")).click();
 	   System.out.println("user on GeneralInquiries page");
    Assert.assertEquals(actualTitle3, expectedTitle3);
    }
    
    @Test(priority = 4)
        public void  user_click_on_ContactSupport() {
 	   driver.findElement(By.linkText("ContactSupport")).click();
 	   System.out.println("user on ContactSupport");
 	   Assert.assertEquals(actualTitle4,expectedTitle4);
    }
    @Test(priority = 5)
    
    public void user_click_on_SauceCommunity() {
 	   driver.findElement(By.linkText("SauceCommunity")).click();
 	   System.out.println("user on SauceCommunity");
 	   Assert.assertEquals(actualTitle5,expectedTitle5);
    }
    @BeforeClass
     
    public void user_is_in_homepage() {
 	   ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        
        

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
    	driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 		driver.get(url);
 		System.out.println("The user is on About home page");
 		
    }
    
    @AfterClass
     public void afterclass() {
 	   driver.quit();
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
