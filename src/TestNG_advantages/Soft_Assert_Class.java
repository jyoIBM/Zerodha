package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class {
@Test
public void Tc() {
	Reporter.log("Shoni", true);
	String expR="Bittu";
	String actR="Anshu";
	// objet of softassert
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(expR,actR);
	System.out.println("i m aftr failed verification");
	//mandatory
	sa.assertAll();
	
}
@Test
public void TC2() {
	Reporter.log("how r u");
	
}
}
