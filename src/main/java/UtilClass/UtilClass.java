package UtilClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass 
{
	public static void getScreenShot(WebDriver driver , String TestName) throws IOException
	{
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String currentDate = f.format(date);
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String path = testName + "./Screenshots/ .png" ;
//		File dest = new File(path);
//		FileHandler.copy(source, dest);
//		return path;
		
		  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("./Screenshots/"+TestName+" .png");
		  FileUtils.copyFile(src, dest);
		  
	}
}
