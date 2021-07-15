package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyList {
	
	WebDriver driver;
	String baseUrl = "https://saucelabs.com/";

	By txtCompany = By.linkText("Company");
	By txtAboutUs = By.linkText("About Us");
	By txtOurTeam = By.linkText("Our Team");
	By txtCareers = By.linkText("Careers");
	By txtSecurity = By.linkText("Security");
	By txtNews    = By.linkText("News");
	By txtPartner = By.linkText("Partner");

	public CompanyList(WebDriver driver) {
		this.driver = driver;


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);


	}
	public void clickCompany()
	{
		driver.findElement(txtCompany).click();
	}
	public void clickAboutUs()
	{
		driver.findElement(txtAboutUs).click();
	}
	public void clickOurTeam()
	{
		driver.findElement(txtOurTeam).click();

	}
	public void clickCareers() 
	{
		driver.findElement(txtCareers).click();

	}
	public void clickSecurity()
	{
		driver.findElement(txtSecurity).click();
	}
	public void clickNews()
	{
		driver.findElement(txtNews).click();
	}
	public void clickPartner()
	{
		driver.findElement(txtPartner).click();
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









