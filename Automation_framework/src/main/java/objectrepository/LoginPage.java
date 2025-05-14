package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement EmailTextfield;

	@FindBy(id = "Password")
	private WebElement PasswordtextFiled;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPasswordtextFiled() {
		return PasswordtextFiled;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
