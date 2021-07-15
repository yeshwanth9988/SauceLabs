package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactList {
	WebDriver driver;
	String baseUrl = "https://saucelabs.com/";

	By txtContact = By.linkText("Contact");
	By txtContactSales = By.linkText("ContactSales");
	By txtGeneralInquiries = By.linkText("General Inquiries");
	By txtContactSupport = By.linkText("Contact Support");
	By txtSauceCommunity = By.linkText("Sauce Community");
	
  public ContactList(WebDriver driver) {
   this.driver = driver;
 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);


	}

   public void clickContact() {
	   driver.findElement(txtContact).click();
   }
   public void clickContactSales() {
	   driver.findElement(txtContactSales).click();
	   
   }
	public void clickGeneralInquiries() {
		driver.findElement(txtGeneralInquiries).click();
	}
	public void clickContactSupport() {
		driver.findElement(txtContactSupport).click();
	}
	public void clickSauceCommunity() {
		driver.findElement(txtSauceCommunity).click();
	}
	public void clickElements(By by) {
		driver.findElement(by).click();
	}

	public void quit()
	{
		driver.quit();
	}

	public void pageload() {
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
}
