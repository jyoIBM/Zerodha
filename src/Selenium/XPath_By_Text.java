package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("19daddys_cutipie");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jyoamar@1019");
		driver.findElement(By.xpath(" //input[@type='submit']")).click();
	}
}
