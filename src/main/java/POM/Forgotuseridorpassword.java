package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotuseridorpassword {
	@FindBy(xpath="//label[@for='radio-31']")private WebElement ForgotUserid;
	@FindBy(xpath="(//input[@animate='true'])[1]")private WebElement Userid;
    @FindBy(xpath="//input[@placeholder='PAN']")private WebElement Pan;
    @FindBy(xpath="//input[@label='E-mail']")private WebElement Email;
    @FindBy(xpath="//label[@for='radio-36']")private WebElement sms;
    @FindBy(xpath="//input[@placeholder='Mobile number (as on account)']")private WebElement Mobileno;
    @FindBy(xpath="//button[@class='button-orange wide']")private WebElement reset;
    @FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement Backtologin;

     public Forgotuseridorpassword(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
     }
     
     public void enterUserid(String user) {
    	 Userid.sendKeys(user);
     }
     
     public void enterPan(String panNumber) {
    	 Pan.sendKeys(panNumber);
     }
     
     public void enteremail(String emailid) {
    	 Email.sendKeys(emailid);
     }
     public void clickonForgotUserId(WebDriver driver) {
    	 ((JavascriptExecutor)driver).executeScript("Script=arguments[0].click",ForgotUserid);
    	 ForgotUserid.click();
     }
     
     public void clickOnReset() {
    	 reset.click();
     }
     
     public void clickOnBacktoLogin() {
    	 Backtologin.click();
     }
     public void clickOnSms() {
    	 sms.click();
     }
     
     public void entermobileno(String no) {
    	 Mobileno.sendKeys(no);
     }
}
