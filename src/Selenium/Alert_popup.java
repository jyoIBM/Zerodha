package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args)throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
    //enter custmer id
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
   //click on submit button
   driver.findElement(By.xpath("//input[@name='submit']")).click();
//   
//   //switch from main webpage to popup
   Alert alt = driver.switchTo().alert();
    Thread.sleep(4000);
    //click on ok button
    alt.accept();
    Thread.sleep(4000);
    //click on cancle button
    alt.dismiss();
    
    //vget the text of popup
    Thread.sleep(3000);
    String text = alt.getText();
    System.out.println(text);
    


}
}
