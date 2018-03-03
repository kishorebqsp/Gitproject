package screen;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic {
	
	public void getPhoto(WebDriver driver,String path) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		Date d=new Date();
		String name = d.toString().replace(':','-');
		
File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst=new File(path+name+".jpeg");
		
		FileUtils.copyFile(src,dst);
	}

}
