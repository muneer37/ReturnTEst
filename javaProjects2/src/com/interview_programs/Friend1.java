package com.interview_programs;



 class Friend22
{
	public void java()
	{
		System.out.println("java");
		int a=1/0;
	}
}
class Friend11
{

	public void testing()
	{
		new Friend22().java();
		System.out.println("testing");
	}
}
class Friend12
{

	public void apti()
	{
		new Friend11().testing();
		System.out.println("apti");
	}
}


public class Friend1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try{
		new Friend12().apti();
		}
		catch(ArithmeticException ref)
		{
			ref.printStackTrace();
			System.out.println("exception handled");
		}
		
		System.out.println("main method ended ");

		

	}

}

