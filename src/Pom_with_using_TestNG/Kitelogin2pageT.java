package Pom_with_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin2pageT {
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntBtn;
	
	//initialization
	public Kitelogin2pageT (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void enterPIN(String pin) {
		PIN.sendKeys(pin);
	}
	
	public void clickcntBtn() {
		cntBtn.click();
		
	}
	
}
