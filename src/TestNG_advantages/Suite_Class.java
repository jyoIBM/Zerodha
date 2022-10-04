package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suite_Class {
	@Test
	public void TC1() {
		Reporter.log("Amar", true);
	}
	@Test
	public void TC2() {
		Reporter.log("Anjali", true);
	}
	@Test
	public void TC3() {
		Reporter.log("jyoti", true);
	}
}
