package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLipkart_Dynamic_Element {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("moblie under 20000",Keys.ENTER);
	Thread.sleep(3000);
	String review = driver.findElement(By.xpath("//span[@class='_2_R_DZ']//span)[4]")).getText();
	System.out.println(review);
	Thread.sleep(3000);
	String review1 = driver.findElement(By.xpath("//div[@class='col col-7-12']/descendant::span)[6]")).getText();
	System.out.println(review1);

}
}
