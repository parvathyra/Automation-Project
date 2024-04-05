package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Holidify_Page_Class {
	WebDriver driver;
	   
	By login = By.xpath("//*[@id=\"headerLoginContainer\"]/a");
	By email = By.id("loginEmail");
	By password = By.id("loginPassword");
	By enter = By.id("loginButton");
	
	By drpdown = By.xpath("//*[@id=\"adults\"]");
	
	public Holidify_Page_Class(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setlogin_values(String addemail,String passwordd)
	{
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(addemail);
		driver.findElement(password).sendKeys(passwordd);
		
		
	}
	public void conti()
	{
		driver.findElement(enter).click();
	}
	public void datepicker()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkInOverview\"]")).click();
		while(true)
		{
		 WebElement	 month=driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[2]"));
		 String month1 = month.getText();
		 if(month1.equals("April 2024"))
		 {
			 System.out.println(month1);
			 break;
		 }
		 else
		 {
			 driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[2]/th[3]")).click();
		 }
	
		}
		
      	List<WebElement>alldates1=driver.findElements(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[5]"));
             for(WebElement dateelement:alldates1)
             {
            	 String date = dateelement.getText();
             System.out.println(date);
             if(date.equals ("19"))
             {
            	 System.out.println(date);
            	 dateelement.click();
            	 System.out.println("date selected");
            	 break;
            	 
             }
         
             
	
             }
	}
	
	public void drpdownn()
	{
		driver.findElement(drpdown).click();
		
	}
	
	
	
}

	

