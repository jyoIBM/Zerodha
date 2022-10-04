package TestNG_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserts_Equal {
	@Test
	public void TC1() {
		Reporter.log("hello", true);
		String expR="Amar";
		String actR="Amar";
		Assert.assertEquals(expR,actR);
	}
}
