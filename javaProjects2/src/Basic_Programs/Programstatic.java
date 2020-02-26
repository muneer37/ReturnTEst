package Basic_Programs;
class ProgramStatic 
{
	static int a=100;
	public static void test(int b)
	{
		System.out.println("\t Test method");
		System.out.println("\t b = "+b);
	}

	public static void main(String[] args) 
	{
		System.out.println("\t Main method");
		System.out.println("\t a = "+a);
		test(200);
		System.out.println("\t Main method end");
	}
}
