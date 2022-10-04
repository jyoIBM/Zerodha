package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	Thread.sleep(1000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	
}
}
