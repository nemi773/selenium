package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class Baseclass {
	public WebDriverUtility wUtil = new WebDriverUtility();
	public Fileutility fUtil = new Fileutility();

	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperty("url"));
	}

	@BeforeMethod
	public void login() throws IOException {
	WelcomePage wp=new WelcomePage(driver);
	wp.getLoginLink().click();
	
	LoginPage lp=new LoginPage(driver);
	lp.getEmailTextfield().sendKeys(fUtil.getDataFromProperty("email"));
	lp.getPasswordtextFiled().sendKeys(fUtil.getDataFromProperty("password"));
	lp.getLoginbutton().click();
	}
	
	@AfterMethod
	public void logOut() {
		HomePage hp=new HomePage(driver);
		hp.getLogoutbotton().click();
		
	}
	

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	

}
	
