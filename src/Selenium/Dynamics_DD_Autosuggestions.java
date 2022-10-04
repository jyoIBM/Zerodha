package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamics_DD_Autosuggestions {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https:google.com");
    //enter kgf in google
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
    Thread.sleep(3000);//(****it is mandatory)
    //inspect elements
    List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
    //use for each loop
    for(WebElement oneoption:alloptions) {
    	String text = oneoption.getText();
    
    	//System.out.println(text);
    	
    	
    	if(text.contains("kgf 2 naa songs")) {
    		oneoption.click();
    		break;
    	}
    
}
}

}


