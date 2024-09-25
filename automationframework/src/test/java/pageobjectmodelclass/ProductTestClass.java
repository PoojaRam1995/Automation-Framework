package pageobjectmodelclass;

import org.testng.annotations.Test;

public class ProductTestClass extends BaseClass{
	
	
	@Test
	
	public void ValidatingClickingOnProduct()
	{
		pc.SearchProduct();
		pc.ClickOnProduct();
	}
	

}
