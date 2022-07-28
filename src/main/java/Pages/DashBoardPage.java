package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase{
	@FindBy(xpath="//span[@class=\"user-id\"]")	private	WebElement	avatarIcon;
	@FindBy(xpath="//h4[@class='username']")	private	WebElement	username;
	@FindBy(xpath="//div[@class='email']")	private	WebElement	email;
	@FindBy(xpath="//button[text()='Start investing ']")	private	WebElement	
	startInvestBtn;
	@FindBy(xpath="(//input[@type='text'])[2]")	private	WebElement	searchBar;
	@FindBy(xpath="//span[@class='tradingsymbol']")	private	WebElement	
	selectShare;
	@FindBy(xpath="//button[text()='Create GTT ']")	private	WebElement	
	createGttBtn;
	@FindBy(xpath="//input[@label=\"Trigger price\"]")	private	WebElement	
	triggerPriceTextbox;
	@FindBy(xpath="//input[@label='Qty.']")	private	WebElement	qtyTextbox;
	@FindBy(xpath="//input[@label='Price']")	private	WebElement	priceTextbox;
	@FindBy(xpath="//button[normalize-space(text())='Cancel']")	private	
	WebElement	cancelBtn;
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String  verifyusername() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		return	username.getText();
	}
	public	String verifyEmailId() throws InterruptedException
	{
		avatarIcon.click();
		Thread.sleep(2000);
		return	email.getText();
	}
	public	void	placeGttOrder()	throws	InterruptedException, EncryptedDocumentException, IOException
	{
	startInvestBtn.click();
	Thread.sleep(2000);
	searchBar.sendKeys(readexcelfile(0, 0));
	Thread.sleep(2000);
	selectShare.click();
	Thread.sleep(2000);
	createGttBtn.click();
	Thread.sleep(2000);
	triggerPriceTextbox.clear();
	Thread.sleep(2000);
	triggerPriceTextbox.sendKeys(readexcelfile(0, 1));
	Thread.sleep(2000);
	qtyTextbox.clear();
	Thread.sleep(2000);
	qtyTextbox.sendKeys(readexcelfile(0, 2));
	Thread.sleep(2000);
	priceTextbox.clear();
	Thread.sleep(2000);
	priceTextbox.sendKeys(readexcelfile(0, 3));
	Thread.sleep(2000);
	cancelBtn.click();
	Thread.sleep(2000);
	}
	
}
