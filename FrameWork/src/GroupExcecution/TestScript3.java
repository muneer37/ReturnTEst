package GroupExcecution;

import org.testng.annotations.Test;

public class TestScript3  extends TestScript{
	
	
		
		@Test(groups="functionalTesting")
		public void functionalTesting()
		{
			System.out.println(" 3rd ft");
		}
		@Test(groups="integrationTesting")
		public void integrationTesting()
		{
		System.out.println(" 3rd it");	
		}
		@Test(groups="systemTesing")
		public void systemTesting()
		{
			System.out.println("3rd systemTesing");
		}

	


}
