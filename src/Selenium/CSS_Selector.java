package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.cssSelector(" [type='text']")).sendKeys("laptop under 50000");
   driver.findElement(By.cssSelector("[type='submit']")).click();
}
}