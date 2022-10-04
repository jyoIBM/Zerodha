package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize  {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	 Thread.sleep(3000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	Dimension d= new Dimension(200, 500);
	driver.manage().window().setSize(d);
	Point p=new Point(300, 200);
	driver.manage().window().setPosition(p);
	driver.close();
}
}
