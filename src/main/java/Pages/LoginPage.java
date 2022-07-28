package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//img[@alt='Kite']")	private	WebElement	kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")	private	WebElement	zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']")	private	WebElement	userIdTextbox;
	@FindBy(xpath="//input[@id='password']")	private	WebElement	passwordTextbox;
	@FindBy(xpath="//button[@type='submit']")	private	WebElement	loginBtn;
	@FindBy(xpath="//input[@id='pin']")	private	WebElement	pinTextbox;
	@FindBy(xpath="//button[@type='submit']")	private	WebElement	continueBtn;
	@FindBy(xpath="//span[@class='nickname']")	private	WebElement	nicknameLabel;
	
	public LoginPage()
	{

       PageFactory.initElements(driver, this);
		
	}
	public boolean verifykitelogo()
	{
		return kiteLogo.isDisplayed();
	}
	public boolean verifyzerodhalogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	public String loginToApp() throws IOException
	{
		userIdTextbox.sendKeys(readpropertiesfile("username"));
		passwordTextbox.sendKeys(readpropertiesfile("pass"));
		loginBtn.click();
		pinTextbox.sendKeys(readpropertiesfile("pin"));
		continueBtn.click();
		return nicknameLabel.getText();	
	}
	public String gettitle()
	{
		return driver.getTitle();
	}
}
