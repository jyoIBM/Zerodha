package Selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
