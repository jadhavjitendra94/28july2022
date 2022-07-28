package TestCase;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import net.jodah.failsafe.internal.util.Assert;

public class groutest extends TestBase{
	LoginPage login;
	@BeforeMethod(groups = {"sanity","regression"})
	
	public void setup() throws IOException
	{
		initalization();
		 login=new LoginPage();
		
	}
	
	@Test(groups = {"sanity"})
	public void verifykitelogotest()
	{
		boolean value = login.verifykitelogo();
		org.testng.Assert.assertEquals(value, true);
		Reporter.log("verifykitelogotest");
	}
	@Test(groups = {"regression"})
	public void verifyzeerodhalogotest()
	{
		boolean value = login.verifyzerodhalogo();
		org.testng.Assert.assertEquals(value, true);
	}
	@Test(groups = {"sanity"})
	public void loginToApptest() throws IOException
	{
		String value = login.loginToApp();
		org.testng.Assert.assertEquals(value, "Akshay");
	}
	@Test(groups = {"regression"})
	public void verifytitletest()
	{
		String value = login.gettitle();
		org.testng.Assert.assertEquals(value, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@AfterMethod(groups = {"regression","sanity"})
	public void exit()
	{
		driver.close();
	}

}
