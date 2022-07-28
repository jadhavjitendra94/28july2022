package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public	static	WebDriver	driver;
	public String readexcelfile(int row,int coll) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\flipcart\\Testdata\\startinvesting.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = data.getRow(row).getCell(coll).getStringCellValue();
		return value;
		
	}
	public String readpropertiesfile(String value) throws IOException
	{

		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\flipcart\\src\\main\\java\\Confing\\Config.properties");
		prop.load(file);
		return prop.getProperty(value);

		
	}
	public	void	initalization() throws IOException
	{
	System.setProperty("webdriver.chrome.driver",	"chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	driver	=	new	ChromeDriver(op);
	driver.manage().window().maximize();
//	driver.get("https://kite.zerodha.com/");
	driver.get(readpropertiesfile("url"));
	driver.manage().timeouts().implicitlyWait(25,	TimeUnit.SECONDS);

}
}

