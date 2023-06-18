package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement SearchFeild ;
	
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement SearchBtn ;
	
//	@FindBy(xpath="//input[@class='_3704LK']")
//	private WebElement SearchFeild ;
	
	
	
	public HomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchFeild()
	{
		SearchFeild.sendKeys("redmi 9 power");
	}
	
	public void SearchBtn()
    {
		SearchBtn.click();
	}

	public String getScreenShot(WebDriver driver, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
