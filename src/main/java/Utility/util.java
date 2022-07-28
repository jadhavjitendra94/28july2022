package Utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.internal.BaseTestMethod;

import Base.TestBase;

public class util extends TestBase{
	public void takephoto(String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\flipcart\\Screenshot/"+name+".jepeg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);

}
}
