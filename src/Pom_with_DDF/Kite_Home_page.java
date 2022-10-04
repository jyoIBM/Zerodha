package Pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_page {
//delaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	public Kite_Home_page (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyuserID(String expID) {
		String actID=userID.getText();
		if(actID.equals(expID)) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC fail");
		}
	}
	}
