package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText ="Register")
	private WebElement Registerlink;
	
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	  
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}


	public WebElement getRegisterlink() {
		return Registerlink;
	}


	public WebElement getLoginLink() {
		return LoginLink;
	}

}
