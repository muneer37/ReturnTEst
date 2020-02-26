package exception;


class Friend1
{
	public void java()
	{
		System.out.println("java");
		int a=1/0;
	}
}
class Friend2
{

	public void testing()
	{
		new Friend1().java();
		System.out.println("testing");
	}
}
class Friend3
{

	public void apti()
	{
		new Friend2().testing();
		System.out.println("apti");
	}
}


public class Checked_Exception {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try{
		new Friend3().apti();
		}
		catch(ArithmeticException ref)
		{
			ref.printStackTrace();
			System.out.println("exception handled");
		}
		
		System.out.println("main method ended ");

		

	}

}
