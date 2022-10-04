package POM_CLASS;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_1_Page {
//Step 1st Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGINBTN;
	
	//Step 2nd Initialization
	public Kite_Login_1_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Step 3rd Utilization
	public void enterUN() {
		UN.sendKeys("DPG458");
	}
	public void enterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}
}
