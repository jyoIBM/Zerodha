package Pom_with_using_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kitetestT {
//declare all useful member as a global
	Sheet sh;
	WebDriver driver;
	KIteLogin1pageT login1;
	Kitelogin2pageT login2;
	Kitelogin3pageT login3;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		 FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Aj.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("7may");
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		 driver.manage().window().maximize();
		 //all objects of POM class
		 login1=new KIteLogin1pageT(driver);
		 login2=new Kitelogin2pageT(driver);
		 login3=new Kitelogin3pageT(driver);
}
	
	@BeforeMethod
	public void loginToApp() {
		//enter un
		 String username = sh.getRow(0).getCell(0).getStringCellValue();//DPG458
		 login1.enterUN(username);
		 //enter pwd
		 String password = sh.getRow(0).getCell(1).getStringCellValue();//
		 login1.enterPWD(password);
		 //clock on loginbtn
		 login1.clickLOGINBTN();
		 
		 //enter pin
		 String pin = sh.getRow(0).getCell(2).getStringCellValue();
		 login2.enterPIN(pin);
		 //click on continue btn
		 login2.clickcntBtn();
		}
	
	@Test
	public void verifyuserID() {
		Reporter.log("running verify user ID", true);

		
		String actID=login3.verifyuserID();
		String expID=sh.getRow(0).getCell(3).getStringCellValue();
		
		Assert.assertEquals(expID, actID,"both are different testcase is failed");
	}
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app", true);
		driver.close();
	}
}
