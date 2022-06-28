package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaDashboardPage;
import POM.ZerodhaLoginPage;
import POM.Zerodhapinpage;
import utility.Parametrization;

public class ZerodhaDashboardTest {

	public static final String WebDriver = null;

	public class SearchboxTest {
		WebDriver driver;
		
		@BeforeMethod
		public void browser() {
			driver = Browser.openBrowser("https://kite.zerodha.com/");
		}
		@Test
		public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException
		{
			ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
			
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
		   
			zerodhaDashboardPage.enterToSearchbar("tatamotors");
	        Thread.sleep(2000);
	      
	        zerodhaDashboardPage.moveTostock(driver);
	        Thread.sleep(4000);
	        
	       /* zerodhaDashboardPage.clickOnBuyb();
	        Thread.sleep(4000);*/
	      
	        
	     }
		  
	}

}
