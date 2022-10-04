package Pom_with_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin3pageT {
@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	public Kitelogin3pageT (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyuserID() {
		String actID=userID.getText();
		return actID;
		
	}
}
