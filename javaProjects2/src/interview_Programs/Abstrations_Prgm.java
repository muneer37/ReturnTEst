package interview_Programs;


abstract class program1
{
	public  abstract void test();
	public  abstract void testing();
	
}
 abstract class program2 extends program1
{
	public void test()
	{
		System.out.println("hii");
	}
}
 
 class program3 extends program2
 {
 	public void testing()
 	{
 		System.out.println("bye");
 	}
 }
public class Abstrations_Prgm {

	public static void main(String[] args) {		
		program3 ref = new program3();
		ref.test();
		ref.testing();

	}

}