package Basic_Programs;

public class program1
{
	static double a=7.8;
	static int b=123;

	public static void test(char c)
    {
	   System.out.println("executing test method");
	   System.out.println("c = " +c);
    }

	public static void main(String[] args) 
	{
		System.out.println("main method started");     
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		test('m');
        System.out.println("main method ended");

	}
}
