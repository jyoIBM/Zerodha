package Pom_with_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Test {
public static void main(String[] args)throws Throwable {
 FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Aj.xlsx");
 Sheet sh = WorkbookFactory.create(fis).getSheet("7may");
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 
 driver.get("https://kite.zerodha.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
 driver.manage().window().maximize();
 
 //1st Pom class
 Kite_Login_1_page klp=new Kite_Login_1_page(driver);
 String username = sh.getRow(0).getCell(0).getStringCellValue();
	klp.enterUN(username);
	
	 String password = sh.getRow(0).getCell(1).getStringCellValue();
	 klp.enterPWD(password);
	 
	 klp.clickLOGINBTN();
	 
	 
	 //2nd Pom class
	 Kite_Login_2_page lp= new Kite_Login_2_page(driver);
	 String pin = sh.getRow(0).getCell(2).getStringCellValue();
	 lp.enterPIN(pin);
	 lp.clickcntBtn();
	 
	 
	//3rd Pom class
	 Kite_Home_page khp= new Kite_Home_page(driver);
	 String expuserID = sh.getRow(0).getCell(3).getStringCellValue();
       khp.verifyuserID(expuserID);
       driver.close();
}



}
