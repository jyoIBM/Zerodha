package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Drag_n_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='Oslo']"));
	WebElement ele2 = driver.findElement(By.xpath("//div[text()='Italy']"));
	Actions add=new Actions(driver);
	add.dragAndDrop(ele1, ele2).perform();
}
}
