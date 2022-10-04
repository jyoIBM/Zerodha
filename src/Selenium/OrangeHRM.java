package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("Admin");
}
}
