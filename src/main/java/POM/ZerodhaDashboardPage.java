package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashboardPage {
	
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="(//span[@class='nice-name'])[1]")private WebElement tatamotors;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement buyB;
	@FindBy(xpath="//button[@class='button-orange sell']")private WebElement sellS;
	@FindBy(xpath="(//span[@class='icon icon-trending-up'])[1]")private WebElement chartC;
	@FindBy(xpath="//span[@class='icon icon-ellipsis']")private WebElement more;
	@FindBy(xpath="//li[@class='search-result-item selected isadded']")private WebElement stockname;
	@FindBy(xpath="//span[@class='icon icon-plus']")private WebElement add;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement list;
	public ZerodhaDashboardPage(WebDriver driver) {
		   PageFactory.initElements(driver,this);
       }
	 public void enterToSearchbar(String nameofStock)
	   {
		  search.sendKeys(nameofStock);
	   }
	 
	 public void moveTostock(WebDriver driver) throws InterruptedException
	 {
		 Actions a = new Actions(driver);
		 Thread.sleep(2000);
		 a.moveToElement(tatamotors);
		 a.perform();
		/* a.moveToElement(add);
		 a.perform();
		 a.click();
	     a.perform();
	     
	     a.moveToElement(buyB);
	     a.perform();
	     a.click();
	     a.perform();*/
	     
	     a.moveToElement(sellS);
	     a.perform();
	     a.click();
	     a.perform();
	  }
	 
	/* public void clickOnBuyb() {
		 buyB.click();
	 }*/
	 
	 
}
