package ebaay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebaay {
	ChromeDriver driver;
	String url="https://www.ebay.com/";
	@BeforeMethod
	public void urlload()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("toys");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"item5bf4b6d949\"]/div/div[1]/div/a/div/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"binBtn_btn_1\"]/span/span")).click();
		
	}

}
