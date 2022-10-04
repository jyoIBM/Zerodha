package TestNG_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_False {
	@Test
public void TC4() {
	Reporter.log("Papa", true);
	boolean actR= false;
	Assert.assertFalse(actR);
}
}
