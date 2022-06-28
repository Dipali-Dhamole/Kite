package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy(xpath ="//input[@id='userid']")private WebElement UserId;
	@FindBy(xpath = "//input[@id='password']")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Login;
	@FindBy(xpath = "//a[text()='Forgot user ID or password?']")private WebElement Forgot;
	@FindBy(xpath ="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement Signup;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserid(String user) {  //name given to the private webelement and object should be same
		UserId.sendKeys(user);
	}
	
	public void enterpassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clickOnlogin() {
		Login.click();
	}
	
	public void clickOnForgotpassword() {
		Forgot.click();
	}
	
	public void clickOnSignup() {
		Signup.click();
	}
}


