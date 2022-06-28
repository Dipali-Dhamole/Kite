package Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;

public class BrokenLinks {
	public static void main(String[] args)
	{
		String url;
		String homepage = "http://www.zlti.com";
		WebDriver driver = Browser.openBrowser(homepage);
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it = li.iterator();
		
		while(it.hasNext()) {
			url = it.next().getAttribute("href");
			
			if(url == null|| url.isEmpty())
			{
				System.out.println("url is Empty or invalid");
				continue;
			}
			
			
			try {
				URL u = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)u.openConnection();
				
				huc.setRequestMethod("HEAD");
				
				huc.connect();
				
				int responseCode = huc.getResponseCode();
				System.out.println(responseCode);
				if(responseCode>=400) {
					System.out.println(url +"Link is Broken");
				}
				else
				{
					System.out.println(url +"Link is working");
				}
			}
			catch(Exception e)
			{
				
			}
			}
			
		}
				
	}


