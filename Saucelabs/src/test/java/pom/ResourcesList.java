package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResourcesList {
	WebDriver driver;
	String baseUrl = "https://saucelabs.com/";
	
	By txtResources = By.linkText("Resources");
	By txtSauceLabsBlog = By.linkText("Sauce Labs Blog");
	By txtResourceCenter = By.linkText("Resource Center");
	By txtArticles = By.linkText("Articles");
	By txtVideos = By.linkText("Videos");
	By txtWebinars = By.linkText("Webinars");
	By txtStudies = By.linkText("Studies");
	By txtWhitePapers = By.linkText("White Papers");
	By txtDataSheets = By.linkText("Data Sheets");
	By txtDocumentation = By.linkText("Documentation");
	By txtKnowledgeBase = By.linkText("Knowledge Base");
	By txtOurExperts = By.linkText("Our Experts");
	By txtTraining = By.linkText("Training");
	By txtCommunity = By.linkText("Community");
	By txtJoinSecretSauce = By.linkText("Join Secret Sauce");
	By txtEvents = By.linkText("Events");
	By txtSelenium = By.linkText("Selenium");
	By txtAppium = By.linkText("Appium");
	
	public ResourcesList(WebDriver driver) {
		this.driver = driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHAKRI\\chromedriver_win32\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);

		
	}
	
	public void clickResources() {
		
		driver.findElement(txtResources).click();
	}
	public void clickSauceLabsBlog() {
		
		driver.findElement(txtSauceLabsBlog).click();
	}
	public void clickResourceCenter() {
		
		driver.findElement(txtResourceCenter).click();
	}
	public void clickArticles() {
		
		driver.findElement(txtArticles).click();
	}
	public void clickVideos() {
		driver.findElement(txtVideos).click();
	}
	public void clickWebinars() {
		
		driver.findElement(txtWebinars).click();
	}
	public void clickStudies() {
		
		driver.findElement(txtStudies).click();
	}
	public void clickWhitePapers() {
		
		driver.findElement(txtWhitePapers).click();
	}
	public void clickDataSheets() {
		
		driver.findElement(txtDataSheets).click();
	}
	public void clickDocumentation() {
		
		driver.findElement(txtDocumentation).click();
	}
	public void clickKnowledgeBase() {
		
		driver.findElement(txtKnowledgeBase).click();
	}
	public void clickOurExperts() {
		
		driver.findElement(txtOurExperts).click();
	}
	public void clickTraining() {
		
		driver.findElement(txtTraining).click();
	}
	public void clickCommunity() {
		
		driver.findElement(txtCommunity).click();
	}
	public void clickJoinSecretSauce() {
		
		driver.findElement(txtJoinSecretSauce).click();
	}
	public void clickEvents() {
		
		driver.findElement(txtEvents).click();
	}
	public void clickSelenium() {
		
		driver.findElement(txtSelenium).click();
	}
	public void clickAppium() {
		
		driver.findElement(txtAppium).click();
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
