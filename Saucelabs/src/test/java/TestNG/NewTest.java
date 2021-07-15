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

import pom.CompanyList;


public class NewTest {
	
	
	String url = "https://saucelabs.com/";
	String expectedTitle1 = "Company";
	String expectedTitle2 = "About Us";
	String expectedTitle3 = "Our Team";
	String expectedTitle4 = "Careers";
	String expectedTitle5 = "Security";
	String expectedTitle6 = "News";
	String expectedTitle7 = "Partner";
	String actualTitle1 = "Company";
	String actualTitle2 = "About Us";
	String actualTitle3 = "Our Team";
	String actualTitle4 = "Careers";
	String actualTitle5 = "Security";
	String actualTitle6 = "News";
	String actualTitle7 = "Partner";
	WebDriver driver;
    CompanyList cp;
    public WebElement Company;
    public JavascriptExecutor js;
   
   
@Test(priority = 1)
   public void user_click_on_Company() {
	   
	   driver.findElement(By.linkText("Company")).click();
	   System.out.println("user on Company");
	   Assert.assertEquals(actualTitle1, expectedTitle1);
   }
   
   @Test(priority = 2)
   public void user_click_on_About_US() {
	   driver.findElement(By.linkText("About Us")).click();
	   System.out.println("user on About Us page");
	   Assert.assertEquals(actualTitle2, expectedTitle2);
   }
   @Test(priority = 3)
   
   public void user_click_on_Our_Team() {
	   driver.findElement(By.linkText("Our Team")).click();
	   System.out.println("user on Our Team page");
   Assert.assertEquals(actualTitle3, expectedTitle3);
   }
   
   @Test(priority = 4)
       public void  user_click_on_Careers() {
	   driver.findElement(By.linkText("Careers")).click();
	   System.out.println("user on careers page");
	   Assert.assertEquals(actualTitle4,expectedTitle4);
   }
   @Test(priority = 5)
   
   public void user_click_on_Security() {
	   driver.findElement(By.linkText("Seccurity")).click();
	   System.out.println("user on Security");
	   Assert.assertEquals(actualTitle5,expectedTitle5);
   }
   
   @Test(priority = 6)
   
   public void user_click_on_News() {
	   driver.findElement(By.linkText("News")).click();
	   System.out.println("user on News page");
	   Assert.assertEquals(actualTitle6,expectedTitle6);
   
   }
    
   
   @Test(priority = 7)
   
   public void user_click_on_Partner() {
	   driver.findElement(By.linkText("Partner")).click();
	   System.out.println("user on Partner page");
	   Assert.assertEquals(actualTitle7,expectedTitle7);
      
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
