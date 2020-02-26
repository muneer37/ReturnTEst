

class ArraysBiggestElement_10sep            // biggest elements find in single decelarations 
{
	public static void main (String[] args)
	{
		int [] a={12,98,99,76,90};
		
	     
		 int max= a[0];
		 
		 for (int i=0;i<a.length ;i++ )
		 {
			 if (max < a[i])
			 {
				 max = a[i];
			 }
		 }
			
	  System.out.println("max="+max);
	  
	}
}