package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import utility.Parametrization;
import utility.Report;

@Listeners(TestListeners.class)

public class LoginPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeMethod
	public void extentReports() {
		reports = Report.createReport();
	}
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser("https://kite.zerodha.com/");
	}
	
	@Test
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException
	{
		test = reports.createTest("loginWithValidCredentialsTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String UserName =Parametrization.getData(0,1);
		String Password = Parametrization.getData(1,1);
		zerodhaLoginPage.enteruserid(UserName);
		zerodhaLoginPage.enterpassword(Password);
		zerodhaLoginPage.clickOnlogin();
	}
	
	@Test
	public void forgotPasswordLinkTest() {
		test = reports.createTest("forgotPasswordLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotpassword();
		}
	
	
	@Test(dependsOnMethods = {"clickonLoginWithoutDataTest"})
	public void signupLinkTest() {
		test = reports.createTest("signupLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignup();
	}
	
	@Test
	public void clickOnLoginWithoutDataTest()
	{
		test = reports.createTest("clickOnLoginWithoutDataTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnlogin();
		String text = zerodhaLoginPage.getErrorText();
		
		String expectedText = "User ID should be minimum 6";
		
		
		//Assert.assertEquals(false, nulltext,expectedText);//hard assert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(text,expectedText);
		
		String userName = Parametrization.getData(0, 1);
		String password = Parametrization.getData(1, 1); 
		zerodhaLoginPage.enteruserid(UserName);
		zerodhaLoginPage.enterpassword(Password);
		zerodhaLoginPage.clickOnlogin();
		
		softAssert.assertAll();
	}
	
	

}
