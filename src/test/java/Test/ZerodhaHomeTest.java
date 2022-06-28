package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZerodhaHomeTest {     //using dataprovider annotation
	@DataProvider(name = "NameData")
	public Object[][]data(){
	    return new Object[][] {{"Velocity","Katraj"},{"Katraj,Pune"}};

}
	@Test(dataProvider = "NameData")
	public void GoToHomeTest(String value,String pass) {
		System.out.println(value + pass);
	}
	
	@Test
	@Parameters({"c"})
	public void HomePageTest(String d) {
		System.out.println(d);
	}
	@Test
	@Parameters({"a","b"})
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	}
