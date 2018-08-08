package homePage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Class one");
	}
	
	@Test
	public void TestOne() {
		System.out.println("Test Class ONe");
	}

}
