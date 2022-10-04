package TestNG_advantages;

import org.testng.Assert;
import org.testng.Reporter;

public class Assert_Not_Equals {

	public void TC2() {
		Reporter.log("hii", true);
		String expR="Anjali";
		String actR="anjali";
		Assert.assertNotEquals(expR, actR);
	}
}
