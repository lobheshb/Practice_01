package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeBtn ;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		closeBtn.click();
	}

	public String getScreenShot(WebDriver driver, String name) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
	
	
	
}
