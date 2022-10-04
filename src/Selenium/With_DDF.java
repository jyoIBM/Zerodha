package Selenium;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class With_DDF {
public static void main(String[] args) throws Throwable {
	 FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Aj.xlsx");
	 Sheet sh = WorkbookFactory.create(fis).getSheet("7may");
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
	 
	 String UN = sh.getRow(0).getCell(0).getStringCellValue();
	 driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	 
	 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	 
	 driver.findElement(By.xpath("//button[text()='Login ']")).click();
	 
	 String PIN = sh.getRow(0).getCell(2).getStringCellValue();	 
	 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	 
	 driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	 
	 String expID = sh.getRow(0).getCell(3).getStringCellValue();
	String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	
	if(expID.equals(actID)) {
		System.out.println("Test case is pass");
}
	else {
		System.out.println("Test case is fail");
	}
	 
	 
	 
}
}
