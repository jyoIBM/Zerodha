package POM_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {
	//Declaration
	@FindBy(xpath="//span=[@class='user-id']")private WebElement userID;
	
	//intialization
	public Kite_Home_Page(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//utilization
	public void verifyuserID() {
		 String expID = "DPG458";
		 String actID = userID.getText();
		 
		 if(actID.equals(expID)) {
			 System.out.println("TC is pass");
		 }
		 
		 else {
			 System.out.println("TC is fail");
		 }
		
	}

}
