package exception;


abstract class Program1

{
	public abstract void videocalls();
	public abstract void audiocalls();
	public abstract void msg();
	}


abstract class Program2 extends Program1
{
	public void videocalls()
	{
		System.out.println("video calls");
	}
}
 class Program3 extends Program2
{
	public void audiocalls()
	{
		System.out.println("audio calls");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println(" calls");
	}
	
}

public class abstractProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program3 p3 = new Program3();
		p3.audiocalls();
		p3.videocalls();
		p3.msg();

	}

}
