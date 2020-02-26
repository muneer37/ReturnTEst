
package exception;
import java.io.*;



class Apple1
{
	public void java() throws IOException
	{
		System.out.println("java");
		throw new IOException();

	}
}
class Apple2
{

	public void testing() throws IOException
	{
		new Apple1().java();
		System.out.println("testing");
	}
}
class Apple3
{

	public void apti() throws IOException
	{
		new Apple2().testing();
		System.out.println("apti");
	}
}


public class Un_Checked_Exception {

	public static void main(String[] args) {
		System.out.println("main method started");
		try{
			new Friend3().apti();
			}
			catch(ArithmeticException ref)
			{
				//ref.printStackTrace();
				System.out.println("exception handled");
			}
		
		
		System.out.println("main method ended ");

		

	}

}
