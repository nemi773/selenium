package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//	delaration
	@FindBy(linkText = "Log out")
	private WebElement Logoutbotton;
	
	@FindBy(linkText = "BOOKS") 
	private WebElement Booklink;
	
	@FindBy(linkText="Computers")
	private WebElement Computerslink;
	
//	initilization
    public HomePage(WebDriver driver) {
    	PageFactory.initElements( driver,this);	
	}
    
//getters()
	public WebElement getBooklink() {
		return Booklink;
	}

	public WebElement getLogoutbotton() {
		return Logoutbotton;	
		
	}
	
	public WebElement getComputerslink() {
		return Computerslink;	
		
	}
    
} 
    


