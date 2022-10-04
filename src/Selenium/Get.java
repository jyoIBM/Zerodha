package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args)throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
 Thread.sleep(3000);
driver.get("https://www.flipkart.com/");
Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
driver.close();
}
}