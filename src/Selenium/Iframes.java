package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chorme.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	Thread.sleep(4000);
	//driver.switchTo().frame("iframeResult");
	//driver.findElement(By.xpath(null))
	
}
}
