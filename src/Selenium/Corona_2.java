package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	 driver.get("https://www.worldometers.info/coronavirus/country/uk");
	 WebElement death = driver.findElement(By.xpath("//div[@class='maincounter-number']//span)[2]"));
	 String d= death.getText();
	 System.out.println("death"+d);
}
	
}
