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

import pom.ResourcesList;

public class Resources {
	

	String url = "https://saucelabs.com/";
	String expectedTitle1 = "Resources";
	String expectedTitle2 = "Sauce Labs Blog";
	String expectedTitle3 = "Resource Center";
	String expectedTitle4 = "Articles";
	String expectedTitle5 = "Videos";
	String expectedTitle6 = "Webinars";
	String expectedTitle7 = "Studies";
	String expectedTitle8 = "White Papers";
	String expectedTitle9 = "Data Sheets";
	String expectedTitle10 = "Documentation";
	String expectedTitle11 = "Knowledge Base";
	String expectedTitle12 = "Our Experts";
	String expectedTitle13 = "Training";
	String expectedTitle14 = "Community";
	String expectedTitle15= "Join Secret Sauce";
	String expectedTitle16 = "Events";
	String expectedTitle17 = "Selenium";
	String expectedTitle18 = "Appium";
	String actualTitle1 = "Resources";
	String actualTitle2 = "Sauce Labs Blog";
	String actualTitle3 = "Resource Center";
	String actualTitle4 = "Articles";
	String actualTitle5 = "Videos";
	String actualTitle6 = "Webinars";
	String actualTitle7 = "Studies";
	String actualTitle8 = "White Papers";
	String actualTitle9 = "Data Sheets";
	String actualTitle10 = "Documentation";
	String actualTitle11 = "Knowledge Base";
	String actualTitle12 = "Our Experts";
	String actualTitle13 = "Training";
	String actualTitle14 = "Community";
	String actualTitle15 = "Join Secret Sauce";
	String actualTitle16 = "Events";
	String actualTitle17 = "Selenium";
	String actualTitle18 = "Appium";
	WebDriver driver;
    ResourcesList cp;
    public WebElement Resourse;
    public JavascriptExecutor js;
   
	
	   
	@Test(priority = 1)
	   public void user_click_on_Resources() {
		   
		   driver.findElement(By.linkText("Resources")).click();
		   System.out.println("user on Resources");
		   Assert.assertEquals(actualTitle1, expectedTitle1);
	   }
	   
	   @Test(priority = 2)
	   public void user_click_on_Sauce_Labs_Blog() {
		   driver.findElement(By.linkText("Sauce Labs Blog")).click();
		   System.out.println("user on Sauce Labs Blog page");
		   Assert.assertEquals(actualTitle2, expectedTitle2);
	   }
	   @Test(priority = 3)
	   
	   public void user_click_on_Resource_Center() {
		   driver.findElement(By.linkText("Our Team")).click();
		   System.out.println("user on Our Team page");
	   Assert.assertEquals(actualTitle3, expectedTitle3);
	   }
	   
	   @Test(priority = 4)
	       public void  user_click_on_Articles() {
		   driver.findElement(By.linkText("Careers")).click();
		   System.out.println("user on careers page");
		   Assert.assertEquals(actualTitle4,expectedTitle4);
	   }
	   @Test(priority = 5)
	   
	   public void user_click_on_Videos() {
		   driver.findElement(By.linkText("Videos")).click();
		   System.out.println("user on Videos");
		   Assert.assertEquals(actualTitle5,expectedTitle5);
	   }
	   
	   @Test(priority = 6)
	   
	   public void user_click_on_Webinars() {
		   driver.findElement(By.linkText("News")).click();
		   System.out.println("user on News page");
		   Assert.assertEquals(actualTitle6,expectedTitle6);
	   
	   }
	    
	   
	   @Test(priority = 7)
	   
	   public void user_click_on_Studies() {
		   driver.findElement(By.linkText("Studies")).click();
		   System.out.println("user on Studies page");
		   Assert.assertEquals(actualTitle7,expectedTitle7);
	      
	   }
	   
   @Test(priority = 8)
	   
	   public void user_click_on_White_Papers() {
		   driver.findElement(By.linkText("White Papers")).click();
		   System.out.println("user on White Papers page");
		   Assert.assertEquals(actualTitle8,expectedTitle8);
	      
	   }   @Test(priority = 9)
	   
	   public void user_click_on_Data_Sheets() {
		   driver.findElement(By.linkText("Data Sheets")).click();
		   System.out.println("user on Data Sheets page");
		   Assert.assertEquals(actualTitle9,expectedTitle9);
	      
	   }   @Test(priority = 10)
	   
	   public void user_click_on_Documentation() {
		   driver.findElement(By.linkText("Documentation")).click();
		   System.out.println("user on Documentation page");
		   Assert.assertEquals(actualTitle10,expectedTitle10);
	      
	   }   @Test(priority = 11)
	   
	   public void user_click_on_Knowledge_Base() {
		   driver.findElement(By.linkText("Knowledge Base")).click();
		   System.out.println("user on Knowledge Base page");
		   Assert.assertEquals(actualTitle11,expectedTitle11);
	      
	   }   @Test(priority = 12)
	   
	   public void user_click_on_Our_Experts() {
		   driver.findElement(By.linkText("Our Experts")).click();
		   System.out.println("user on Our Experts page");
		   Assert.assertEquals(actualTitle12,expectedTitle12);
	      
	   }   @Test(priority = 13)
	   
	   public void user_click_on_Training() {
		   driver.findElement(By.linkText("Training")).click();
		   System.out.println("user on Training page");
		   Assert.assertEquals(actualTitle13,expectedTitle13);
	      
	   }   @Test(priority = 14)
	   
	   public void user_click_on_Community() {
		   driver.findElement(By.linkText("Community")).click();
		   System.out.println("user on Community page");
		   Assert.assertEquals(actualTitle14,expectedTitle14);
	      
	   }
	      @Test(priority = 15)
	  
	   public void user_click_on_Join_Secret_Sauce() {
		   driver.findElement(By.linkText("Join Secret Sauce")).click();
		   System.out.println("user on Join Secret Sauce page");
		   Assert.assertEquals(actualTitle15,expectedTitle15);
		   }
		
		   @Test(priority = 16)
		   
		   public void user_click_on_Events() {
			   driver.findElement(By.linkText("Events")).click();
			   System.out.println("user on Events page");
			   Assert.assertEquals(actualTitle16,expectedTitle16);	
		   }
		   
		   @Test(priority = 17)
		   
		   public void user_click_on_Selenium() {
			   driver.findElement(By.linkText("Selenium")).click();
			   System.out.println("user on Selenium page");
			   Assert.assertEquals(actualTitle17,expectedTitle17);
		   }
		   
	   
		@Test(priority = 18)
			   
			   public void user_click_on_Appium() {
				   driver.findElement(By.linkText("Appium")).click();
				   System.out.println("user on Appium page");
				   Assert.assertEquals(actualTitle18,expectedTitle18);
			      
	      
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
		   ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.quit();
	   }
	   
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	