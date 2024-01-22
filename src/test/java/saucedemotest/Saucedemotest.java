package saucedemotest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import saucedemopage.Saucedemopage;

public class Saucedemotest {
	WebDriver driver;
@Test
public void test()
{
	Saucedemopage ob=new Saucedemopage(driver);
	String x1="F:\\saucedemo.xlsx";
	String sheet="Sheet1";
	int rowcount=Excelutils.getrowcount(x1,sheet);
	for(int i=1;i<=rowcount;i++)
	{
		String username=Excelutils.getcellvalue(x1,sheet,i,0);
		System.out.println(username);
		String password=Excelutils.getcellvalue(x1,sheet,i,1);
		System.out.println(password);
		ob.setvalues(username, password);
	}
	
	ob.login();
}

}



