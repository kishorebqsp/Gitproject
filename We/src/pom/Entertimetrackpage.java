package pom;


import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Entertimetrackpage extends Base_page{
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement aboutacti;
	
	@FindBy(xpath="//span[.='actiTIME 2014 Pro']")
	private WebElement version;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closebtn;
	
	public Entertimetrackpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickhelp()
	{
		help.click();
	}
	
	
	public void clickabout()
	{
		aboutacti.click();
	}
	
	public void verifyversion()
	{
		String aversion = version.getText();
		Assert.assertEquals(aversion,"actiTIME 2014 Pro");
		Reporter.log("Version is same",true);
	}
	
	public void clickclose()
	{
		closebtn.click();
	}
	
	
	public void clicklogout()
	{
		logout.click();
	}
	
	public void verifyhomepagetitle(String home)
	{
		verifyTitle(home);
	}
	
	
	
	
	
	
	
	
	
	
	
}
