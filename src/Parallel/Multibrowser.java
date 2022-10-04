package Parallel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		WebDriver driver = null;
		
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
}
		
		driver.get("https://www.amazon.com/");
	}
	

}
