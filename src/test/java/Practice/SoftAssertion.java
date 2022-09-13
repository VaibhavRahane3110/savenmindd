package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {


	// Soft Assert
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void testAssertions() {
		int i = 10;
			
		softAssert.assertEquals(i, 10);
	  //softAssert.assertNotEquals(10, 20);                 // for negative check
		System.out.println("This is test case 1");          // If assertion is fail then aster fail the assertion next statements can't be execute
	}
		
	@Test
	public void testAssertions1() {
		int j = 20;
		
		softAssert.assertTrue(j==20);
	  //softAssert.assertFalse(false);                      // for negative check
		System.out.println("This is test case 2");
	}
	
	@AfterClass
	public void termDown() {
		softAssert.assertAll();                             // only when using soft assert
	}
}	
	// assertEquals
	// assertNotEquals
	// assertTrue
	// assertFalse    are the methods of soft assert


//Assert     - Immediately Terminate the flow of the program.           (Validation)
//SoftAssert - Run all the program and throw the exception at the end.  (Verification)


