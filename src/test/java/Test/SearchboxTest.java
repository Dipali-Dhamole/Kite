package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaSearchBox;
import POM.Zerodhapinpage;
import utility.Parametrization;

public class SearchboxTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String UserName =Parametrization.getData(0,1);
		String Password = Parametrization.getData(1,1);
		zerodhaLoginPage.enteruserid(UserName);
		zerodhaLoginPage.enterpassword(Password);
		zerodhaLoginPage.clickOnlogin();
		
		Thread.sleep(2000);
	    Zerodhapinpage zerodhapinpage = new Zerodhapinpage(driver); 
		String pin = Parametrization.getData(2,1);
		System.out.println(pin);
		zerodhapinpage.enterPin(pin);
	    zerodhapinpage.clickOnContinue();
	 
	    Thread.sleep(2000);
		ZerodhaSearchBox zerodhasearchbox = new ZerodhaSearchBox(driver);
		String search = Parametrization.getData(3,1);
		System.out.println(search);
		zerodhasearchbox.entersharename(search);
      
        Thread.sleep(2000);
        
        click.clickOnsharename();
       

		
	}
	  
}
