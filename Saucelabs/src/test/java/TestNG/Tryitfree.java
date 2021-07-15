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

import pom.TryitfreeList;
public class Tryitfree {

	String url = "https://saucelabs.com/";
	String expectedTitle1 = "Tryitfree";
	String expectedTitle2 = "Sign up with Google";
	String expectedTitle3 = "Sign up with GitHub";
	String expectedTitle4 = "Sign up with Email";
	String actualTitle1 = "Tryitfree";
	String actualTitle2 = "Sign up with Google";
	String actualTitle3 = "Sign up with GitHub";
	String actualTitle4 = "Sign up with Email";
	WebDriver driver;
    pom.TryitfreeList cp;
    public WebElement TryitfreeList;
    public JavascriptExecutor js;
    
    @Test(priority = 1)
    public void user_click_on_Tryitfree() {
 	   
 	   driver.findElement(By.linkText("Tryitfree")).click();
 	   System.out.println("user on Tryitfree page");
 	   Assert.assertEquals(actualTitle1, expectedTitle1);
    }
    
    @Test(priority = 2)
    public void user_click_on_Sign_up_with_Google() {
 	   driver.findElement(By.linkText("Sign up with Google")).click();
 	   System.out.println("user on Sign up with Google");
 	   Assert.assertEquals(actualTitle2, expectedTitle2);
    }
    @Test(priority = 3)
    
        public void  user_click_on_Sign_up_with_GitHub() {
 	   driver.findElement(By.linkText("Sign up with GitHub")).click();
 	   System.out.println("user on Sign up with GitHub page");
 	   Assert.assertEquals(actualTitle3,expectedTitle3);
    }
    @Test(priority = 4)
    
    public void user_click_on_Sign_up_with_Email() {
 	   driver.findElement(By.linkText("Sign up with Email")).click();
 	   System.out.println("user on Sign up with Email");
 	   Assert.assertEquals(actualTitle4,expectedTitle4);
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
