package Array;






class Arraysum                  //sum program
{
	public static int sum(int [] ar) 
	{
		int add=0;
		for(int i=0;i<ar.length;i++)
		{
		 System.out.println("i value is"+i);

			add=add+ar[i];
			System.out.println("ADD VALUE = "+add);
		}
		return add;
	}
      public static void main(String[] args) 
	{
		  int[] abc={12,5,8};
		 int res1=sum(abc);
		System.out.println("Result="+res1);
		//System.out.println("Result="+sum(abc));
		//int[] def={20,30,40,50,60};
		//System.out.println("Result="+sum(def));

	}
}
