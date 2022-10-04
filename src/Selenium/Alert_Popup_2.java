package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	Alert alt = driver.switchTo().alert();
	Thread.sleep(3000);
	alt.accept();
	
}
}
