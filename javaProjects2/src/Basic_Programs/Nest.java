package Basic_Programs;
class Nest 
{
	public static void main(String[] args) 
	{
		int a=1234; // nested program 

		int b=1234;

		if(a==b)
		{
			int c=786;
			int d=786;
			
			if(c==d)
	          {
		            System.out.println("Hello World!");
	           }
		}
		else
		{
			System.out.println("bye world");
		}
	}
}
