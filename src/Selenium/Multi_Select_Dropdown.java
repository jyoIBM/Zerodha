package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/LENOVO/Documents/PARADISE.html");
	WebElement drp= driver.findElement(By.xpath("//select[@id='PARADISE']"));//inspect the drop down
	Select s=new Select(drp);//create object of select class
	if(s.isMultiple()) {
		System.out.println("given DD is multiselectable");//check whether DD is multiselectable or not
	}
	else {
		System.out.println("it is not multiselectable");
		
	}
	List<WebElement> allelements=s.getOptions();//get size of all options
	System.out.println(allelements.size());
	
	/*for(int i=0;i<=allelements.size()-1;i++) {
		WebElement oneelement = allelements.get(i);
		String text = oneelement.getText();
		
		System.out.println(text);
		
}*/
	for(WebElement oneelement:allelements) {
		  String text = oneelement.getText();
		  System.out.println(text);
	}
	s.selectByIndex(0);
	s.selectByValue("d");
	s.selectByVisibleText("PIZZA");
}
}
