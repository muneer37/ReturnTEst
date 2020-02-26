package skiTEst;

import org.testng.annotations.Test;


//@Test(enabled = true)
public class second {
	
	@Test(enabled = false)
	public void testsecond()
	{
		System.out.println(" 2a");
	}
	
	@Test
	public void testsecondlast()
	{
		System.out.println(" 2b");
	}

}
