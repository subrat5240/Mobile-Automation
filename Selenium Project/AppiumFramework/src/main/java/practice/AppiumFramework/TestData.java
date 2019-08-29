package practice.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
	{
		Object[][] obj=new Object[][]
				{
			
			{"Subrat"},{"!@#$$%^&"},{"Awqe23145!@#"}
			
				};
	return obj;	
	
	}
	
	

}
