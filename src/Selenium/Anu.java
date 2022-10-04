package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anu {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
     driver.manage().window().maximize();


}
}
