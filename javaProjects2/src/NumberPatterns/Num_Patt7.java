package NumberPatterns;

public class Num_Patt7 {          // printing 1-100number without for loop
	public static void test(int a)
	{
		   if (a<=100)
		   {
			   System.out.println("a="+a);
			   a++;
			   System.out.println(a++);
			   test(a);
			  
		   }
	}

	public static void main(String[] args) 
	{
	
		test(1);
	}

}
