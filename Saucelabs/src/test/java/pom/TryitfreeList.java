package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryitfreeList {

	
	WebDriver driver;
	String baseUrl = "https://saucelabs.com/";
	
	By txtTryitfree = By.linkText("Tryitfree");
	By txtSignupwithGoogle = By.linkText("Sign up with Google");
	By txtSignupwithGitHub = By.linkText("Sign up with GitHub");
	By txtSignupwithEmail = By.linkText("Sign up with Email");
 
	
	public TryitfreeList(WebDriver driver) {
	this.driver = driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseUrl);


}
	public void clickTryitfree() {
		driver.findElement(txtTryitfree).click();
	}
	
	public void clickSignupwithGoogle() {
		driver.findElement(txtSignupwithGoogle).click();
		
	}
	public void clicksSignupwithGitHub() {
		driver.findElement(txtSignupwithGitHub).click();
	}
	public void clicksSignupwithEmail() {
		driver.findElement(txtSignupwithEmail).click();
	}
	public void clickElements(By by) {
		driver.findElement(by).click();
	}

	public void quit()
	{
		driver.quit();
	}


}
