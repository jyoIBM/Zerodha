package POM_CLASS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    //1st POM class
    Kite_Login_1_Page klp=new Kite_Login_1_Page(driver);
    klp.enterUN();
    klp.enterPWD();
    klp.clickLOGINBTN();
       
    //2nd POM class
    Kite_Login_2_Page klp2= new  Kite_Login_2_Page(driver);
    klp2.enterPIN();
    klp2.clickcntBtn();
    
    //3rd POM class
    Kite_Home_Page khp=new Kite_Home_Page(driver);
    khp.verifyuserID();
    driver.close();

}
}
