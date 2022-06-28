package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Forgotuseridorpassword;
import utility.Parametrization;

public class ZerodhaforgotpasswordTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser("https://kite.zerodha.com/");
	}
	
	
	@Test
	public void enteruseridTest() throws EncryptedDocumentException, IOException {
		 Forgotuseridorpassword forgotuseridorpassword = new Forgotuseridorpassword(driver);
		 String UserName = Parametrization.getData(0,1);
		 forgotuseridorpassword.enterUserid(UserName);
	}
	@Test
	public void enteremailidTest() {
		Forgotuseridorpassword forgotuseridorpassword = new Forgotuseridorpassword(driver);

	}

}
