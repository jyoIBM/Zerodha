package TestNG_advantages;

import org.testng.Assert;
import org.testng.Reporter;

public class Assert_fail {
	
	public void TC5() {
		Reporter.log("My family", true);
		Assert.fail();//verification 1
		System.out.println("I LOVE MY FAMILY TOO MCH");//Verification2 is after fail
	}
	
	public void TC6() {
		Reporter.log("Aj");
	}

}
