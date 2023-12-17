package flipkartTestPkg;

import org.testng.annotations.Test;

import BaseClass.flipkartBaseClass;
import flipkartPagePkg.flipkartPage;


public class flipkartTest extends flipkartBaseClass {

	
	
	@Test 
	public void test() {
	
		flipkartPage fk =new flipkartPage (driver); 
		fk.search();
		fk.product();
		fk.windowHandler();
		fk.PlaceOrder();
		fk.email();
		fk.Continue();
	
}
	
}
	
	
	

