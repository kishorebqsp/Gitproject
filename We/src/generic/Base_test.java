package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public  class Base_test implements Auto_const{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenAppln()
	{
//		System.setProperty(CHROME_KEY,CHROME_VALUE);
//		driver=new Driver();
		ChromeDriverManager.getInstance().setup();
		driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void Closeappln()
	{
		driver.quit();
	}
	
	
	

}
