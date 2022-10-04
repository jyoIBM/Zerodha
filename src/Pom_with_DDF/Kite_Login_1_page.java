package Pom_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_1_page {
	//Step 1st Declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
		@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGINBTN;
		
		//Step 2nd Initialization
		public  Kite_Login_1_page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//Step 3rd Utilization
		public void enterUN(String username) {
			UN.sendKeys(username);
		}
		public void enterPWD(String password) {
			PWD.sendKeys( password);
		}
		public void clickLOGINBTN() {
			LOGINBTN.click();
		}
}
