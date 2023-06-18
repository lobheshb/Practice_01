package TestClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POM.AddToCart;
import POM.HomePage;
import POM.LoginPage;
import POM.MobilePage;
import UtilClass.UtilClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Test1 extends UtilClass {
	
	 WebDriver driver;
	 LoginPage lp;
	 HomePage hp;
	 MobilePage mp;
	 AddToCart ac;
	 
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass
	  public void beforeClass() 
	{
		  driver = BaseClass.getChromeDriver();
		
		  htmlReporter = BaseClass.getHtmlReporter();
		  report =  BaseClass.getExtentReport();
		  test = BaseClass.getTestForReporter("Test1");
	 }
	
 @BeforeMethod
 public void beforeMethod() 
	{
	     lp=new LoginPage(driver);
	     hp=new HomePage(driver);
	     mp=new MobilePage(driver); 
	     ac=new AddToCart(driver);
	     
	     
	     
  }
		
  @Test(priority=1)
  public void loginPage() throws InterruptedException 
  {
	  lp.clicklogin();
	 
  }
  
  @Test(priority=2)
  public void mome() throws InterruptedException 
  {
	//  Thread.sleep(3000);
      hp.SearchFeild();
       hp.SearchBtn();
  }  
  @Test(priority=3)
  public void selectMobile() throws InterruptedException 
  {
	 mp.SelectMobile();
  }  
  
  @Test(priority=4)
  public void addtocart() throws InterruptedException 
  {
	// ac.AddToCart();
  } 
  
  
  
  
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException 
  {
	  if(result.getStatus()==result.SUCCESS)
	  {
		  test.log(Status.PASS, "Test Is Passed" +result.getName());
	  }
	  else 
	 {
		 String path = hp.getScreenShot(driver, result.getName());
		  test.log(Status.FAIL, "Test Is Failed"+ result.getName());
		  MediaEntityBuilder.createScreenCaptureFromPath(path).build();
	  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
	  report.flush();
	  
	  Thread.sleep(2000);
  }

}
