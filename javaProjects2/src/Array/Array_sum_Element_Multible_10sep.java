package Array;


class Array_sum_Element_Multible_10sep            // SUM elements find in MULTIBLE -decelarations 
{
	public static int sum(int [] a)
	{
	     
		 int add= a[0];
		 
		 for (int i=0;i<a.length ;i++ )
		 {
			 add=add+a[i];
		 }
		 return add;
			
	}
	 
	
	public static void main (String[] args)
	{
		int [] a={12,98,99,76,90};

		int ref= sum(a);

	  System.out.println("max="+ref);
  
	}
}