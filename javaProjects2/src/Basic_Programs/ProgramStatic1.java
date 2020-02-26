package Basic_Programs;


class loops
{
	static String str=" Munni";
	public static void test(int b)
	{
		System.out.println("\t Test method");
		System.out.println("\t b = "+b);
	}
}

class ProgramStatic1 
{
	public static void main(String[] args) 
	{
		System.out.println("\t Main method");
		System.out.println("\t str = "+loops.str);
		loops.test(200);
		System.out.println("\t Main method end");
	}

	
}
