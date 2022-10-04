package POM_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Stale_Element_Reference {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement txtfield=driver.findElement(By.xpath("//input[@name='q']"));
	txtfield.sendKeys("Indian movies");
	driver.navigate().refresh();
	txtfield.sendKeys("Sairat");
}
}
