package TestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardPageTest extends TestBase{
	DashBoardPage dash;
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
		 dash=new DashBoardPage();
		  login=new LoginPage();
		  login.loginToApp();
		 
		
	}
	@Test
	public	void	verifyUsernameTest()	throws	InterruptedException
	{
	String	value	=	dash.verifyusername();
	Assert.assertEquals(value,	"Akshay Rohidas Jagadale");
	}
	@Test
	public	void	verifyEmailIdTest()	throws	InterruptedException
	{
	String	value =	dash.verifyEmailId();
	Assert.assertEquals(value,	"jadhavjitendra378@gmail.com");
	}
	@Test
	public	void	placeGttOrderTest()	throws	InterruptedException, EncryptedDocumentException, IOException
	{
	dash.placeGttOrder();
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
