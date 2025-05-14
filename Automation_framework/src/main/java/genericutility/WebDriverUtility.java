package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	//to perform keybord and mouseover Actions
	public void mousehover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	public void rightclick(WebDriver driver,WebElement elemet) {
		Actions act=new Actions(driver);
		act.contextClick(elemet);
		
	}
	
	public void scrolling(WebDriver driver,WebElement elemet) {
		Actions act=new Actions(driver);
		act.scrollToElement(elemet);
    }
//	dropdown
	
	public void selectDropDown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectDropDown(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void selectDropDownByText(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	//iframe
	public void switchTOframe(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchTOframe(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);		
    }
	public void switchTOframe(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);		
    }
	
	//popup
	
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();		
	}
	
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();	
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();		
	}
	
    //  screenshot
	
	public void getPhoto(WebDriver driver) throws IOException {
		Javautility jUtil=new Javautility();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+jUtil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
}
	
