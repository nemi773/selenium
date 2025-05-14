package books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)

public class TC_DWS_001_Test extends Baseclass{
	
	@Test
	public void clickOnbook() {
		HomePage hp=new HomePage(driver);
		hp.getBooklink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Books page is not diaplayed");
		Reporter.log("books page is diaplayed");
		Reporter.log("books page is diaplayed");
	}
	
	
	

}
