package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {  //userdefined method for browser launching
	public static WebDriver openBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\resea\\Desktop\\chromedrivernew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting 
		driver.get("https:/www.erodha.com");//method ofWebDriver interface
		driver.manage().window().maximize();
		return driver;
	}
	
}