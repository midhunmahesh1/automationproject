package augustt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationpage {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement name;
	
	@FindBy (xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signup;
	
	
	public Automationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void setvalues(String email1,String password)

{
name.sendKeys(email1);
email.sendKeys(password);


	
}
public void login()
{
	signup.click();
}

}
