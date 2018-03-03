package scripts;

import org.testng.annotations.Test;

import generic.Base_test;
import generic.Excel;
import pom.Entertimetrackpage;
import pom.Loginpage;

public class VerifyActitimeVersion extends Base_test{
	
	@Test
	public void testVerifyActitimeVersion() throws InterruptedException
	{
		String un = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,0);
		String pwd = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,1);
		String lp_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,2);
		String hp_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,3);
		
		Loginpage lp=new Loginpage(driver);
		lp.setuSername(un);
		
		lp.setPassword(pwd);
		
		lp.clicklogin();
		
		Entertimetrackpage ep=new Entertimetrackpage(driver);
		ep.verifyhomepagetitle(hp_title);
		
		ep.clickhelp();
		ep.clickabout();
		
		ep.verifyversion();
		
		ep.clickclose();
		ep.clicklogout();
		
		lp.verifyloginpagetitle(lp_title);
	}

}
