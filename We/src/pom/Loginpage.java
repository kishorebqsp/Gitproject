package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Base_page {
	
	public static WebDriver driver;
	
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	

	public void setuSername(String un1)
	{
		
	 un.sendKeys(un1);
	}
	
	public void setPassword(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	public void verifyeermsg()
	{
		verifyElementispresent(errmsg);
	}
	
	public void verifyloginpagetitle(String login)
	{
		verifyTitle(login);
	}
	
	
	
	
	
	
	
	
	
	
	

}
