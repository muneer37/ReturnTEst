package GroupExcecution;

import org.testng.annotations.Test;

public class TestScript2  extends TestScript
    {
	
	

		
		@Test(groups="functionalTesting")
		public void functionalTesting()
		{
			System.out.println("2 nd ft");
		}
		@Test(groups="i  ntegrationtesting")
		public void integrationTesting()
		{
		System.out.println(" 2 nd it");	
		}
		@Test(groups="systemTesting")
		public void systemTesting()
		{
			System.out.println("2nd systemTesting");
		}

	}



