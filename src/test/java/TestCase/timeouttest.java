package TestCase;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LoginPage;
import Utility.Utility;
import Utility.util;
import bsh.util.Util;
import net.jodah.failsafe.internal.util.Assert;

public class timeouttest extends TestBase{
	LoginPage login;
	@BeforeMethod
	
	public void setup() throws IOException
	{
		initalization();
		 login=new LoginPage();
		
	}
	
	@Test(enabled = false)
	public void verifykitelogotest()
	{
		boolean value = login.verifykitelogo();
		org.testng.Assert.assertEquals(value, true);
		Reporter.log("verifykitelogotest");
	}
	@Test(timeOut = 500)
	public void verifyzeerodhalogotest()
	{
		boolean value = login.verifyzerodhalogo();
		org.testng.Assert.assertEquals(value, true);
	}
	@Test(enabled = false)
	public void loginToApptest() throws IOException
	{
		String value = login.loginToApp();
		org.testng.Assert.assertEquals(value, "Akshay");
	}
	@Test(enabled = false)
	public void verifytitletest()
	{
		String value = login.gettitle();
		org.testng.Assert.assertEquals(value, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@AfterMethod
	public void exit(ITestResult itr)
	{
		if(ITestResult.FAILURE==itr.getStatus())
		{
				
		}
		driver.close();
	}

}
