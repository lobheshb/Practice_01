package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart 
{
	WebDriver driver;
	@FindBy(xpath="((//li[@class='col col-6-12'])[1])")
	private WebElement AddToCart ;
	
	public AddToCart (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCart()
	{
		AddToCart.click();
		
	}
	
}
