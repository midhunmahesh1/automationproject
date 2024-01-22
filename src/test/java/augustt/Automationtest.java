package augustt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Automationtest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
@Test
public void test()
{
	Automationpage ob=new Automationpage(driver);
	ob.setvalues("midhun","asdddddf@gmail.com");
	
	ob.login();
}

}
