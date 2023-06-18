package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage 
{
	WebDriver driver;
	@FindBy(xpath="//div[text()='REDMI A1+ (Light Green, 32 GB)']")
	private WebElement SelectMobile ;
	
	public MobilePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectMobile()
	{
		SelectMobile.click();
		
//		List<String> address = new ArrayList<String>(driver.getWindowHandles());
//		 driver.switchTo().window(address.get(1));
		
	}
	
	
	
	
}
