package scripts;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import generic.Base_test;
import generic.Excel;
import pom.Entertimetrackpage;
import pom.Loginpage;

public class ValidLoginLogout extends Base_test{
	
	@Test
	public void testValidLoginLogout()
	{
		String un = Excel.getCellValue(PATH,"ValidLoginLogout",1,0);
		String pwd = Excel.getCellValue(PATH,"ValidLoginLogout",1,1);
		String lp_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,2);
		String hp_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,3);
		
		Loginpage lp=new Loginpage(driver);
		lp.setuSername(un);
		
		lp.setPassword(pwd);
		
		lp.clicklogin();
		
		Entertimetrackpage ep=new Entertimetrackpage(driver);
		ep.verifyhomepagetitle(hp_title);
		
		ep.clicklogout();
		
		lp.verifyloginpagetitle(lp_title);

	}
}
