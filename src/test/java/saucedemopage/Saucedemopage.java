package saucedemopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemopage {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"user-name\"]")
	WebElement name;
	
	@FindBy (xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement signup;
	
	
	public Saucedemopage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void setvalues(String email1,String password1)

{
name.sendKeys(email1);
password.sendKeys(password1);


	
}
public void login()
{
	signup.click();
}


}
