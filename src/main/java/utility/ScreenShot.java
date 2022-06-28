package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class ScreenShot {
	public static void main(String args []) throws IOException
	{
		WebDriver driver = Browser.openBrowser("https://facebook.com/");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
         File destination = new File("C:\\Users\\resea\\Pictures\\Screenshots\\facebook.jpeg");
		//File destination = new File("C:\\Users\\resea\\Pictures\\Screenshots\\.png");//we can give different extension to save screenshotlike image,jpg
	//	File destination = new File("C:\\Users\\resea\\Pictures\\Screenshots\\vctc.jpg");
				
	   FileHandler.copy(source, destination);		
		
	}}



