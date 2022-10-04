package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke_Testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	String expT="actiTIME-Login";
	driver.get("https://demo.actitime.com/login.do");
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case i fail");
	}
	
}
}
