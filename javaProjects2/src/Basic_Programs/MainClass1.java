package Basic_Programs;
class Sample4  
{
	double a=6.7;    //accessing non static member from a non static contex

	public void test()
	{
		System.out.println("HAPPY");
     }

	 public void display()
	{
		 test();
		 System.out.println("a"+a);
							
		System.out.println("sad");
	}
}


		class MainClass1
		{
			public static void main(String[] args)
			{
				System.out.println("main method started");

				Sample4 s1=new Sample4();
				System.out.println("A1="+s1.a);
				s1.test();
				s1.display();
				System.out.println("main method ended");
				
				
			}
		}


