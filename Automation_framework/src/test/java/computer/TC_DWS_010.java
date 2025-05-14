package computer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import objectrepository.HomePage;

public class TC_DWS_010  extends Baseclass{

	@Test
	public void clickonComputers() {
		HomePage hp=new HomePage(driver);
		hp.getComputerslink().click();
		assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computers page is not diaplayed");
		Reporter.log("Computer page is displayed");

    }
}
