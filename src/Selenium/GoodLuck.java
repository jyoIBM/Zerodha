package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoodLuck {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/LENOVO/Documents/hello1.html");
	WebElement drp= driver.findElement(By.xpath("//input[@id='GoodLuck']"));
	Select s=new Select(drp);
	s.selectByIndex(1);
	s.selectByValue("a");
	s.selectByVisibleText("Dosa");
	
}
}
