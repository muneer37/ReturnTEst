

class ArraysBiggestElement_Multible_10sep            // biggest elements find in MULTIBLE -decelarations 
{
	public static int maximum(int [] a)
	{
	     
		 int max= a[0];
		 
		 for (int i=0;i<a.length ;i++ )
		 {
			 if (max < a[i])
			 {
				 max = a[i];
			 }
		 }
		 return max;
			
	}
	 
	
	public static void main (String[] args)
	{
		int [] a={12,98,99,76,90};

		int ref= maximum(a);

	  System.out.println("max="+ref);

	  int [] a1 ={9,8,7,6,5};

		int ref2=maximum(a1);

	  System.out.println("max 2="+ref2);
	  
	  
	}
}