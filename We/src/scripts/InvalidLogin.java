package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_test;
import generic.Excel;
import pom.Loginpage;

public class InvalidLogin extends Base_test{
	
	@Test
	public void testInvalidLogin() throws InterruptedException
    {
		String un = Excel.getCellValue(PATH,"InvaliLogin",1,0);
		String pwd = Excel.getCellValue(PATH,"InvaliLogin",1,1);
		
		
		Loginpage lp=new Loginpage(driver);
		Thread.sleep(2000);
		lp.setuSername(un);
		Thread.sleep(2000);
		lp.setPassword(pwd);
		Thread.sleep(2000);
		lp.clicklogin();
		Thread.sleep(2000);
		lp.verifyeermsg();
		
		
	}
}
