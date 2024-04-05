package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Holidify_Page_Class;

public class Holidify_Test {
	
	WebDriver driver;
	@BeforeTest()
	public void test()
	{
		driver =  new ChromeDriver();
	}
	@BeforeMethod()
	public void url()
	{
		driver.get("https://www.holidify.com/");
	driver.manage().window().maximize();
	}
	@Test()
	public void testt() throws Exception
	{
	Holidify_Page_Class hp = new Holidify_Page_Class(driver);
//		hp.setlogin_values("parvathy@gmail.com", "123445");
//		hp.conti();
	
		hp.datepicker();
		hp.drpdownn();
		 WebElement noelement=driver.findElement(By.xpath("/html/body/nav/div[1]/a/img"));
		 File src = noelement.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src,new File("./Screen//logo.png"));
	
	}
}
