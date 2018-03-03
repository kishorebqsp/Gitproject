package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base_page {
	public  WebDriver driver;
	
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void verifyTitle(String etitle)
	{
		try{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("title is matching",true);
		
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			
	    }
	}
	public void verifyElementispresent(WebElement element)
	{
		try{
	
			
			WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
		
		}
		catch(Exception e)
		{
			Reporter.log("element  is not present",true);
			
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
