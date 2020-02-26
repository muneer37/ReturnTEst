



class Arraysum2   //ascedding number
{
	public static int[] sort (int[] ar) 
	{
		int sort=ar[0];
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=1;i+1<ar.length;j++)
			{
		       if (ar[i]>ar[j])
		        {
			     int temp=ar[i];
				 ar[i]=ar[j];
				 ar[j]=temp;
		         }
		   
		   System.out.println("sort");
			}
	    }
	return ar;
	}
	
	public static void main (String[] args)
	{
		
		//Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: "); 
		int [] ar={12,15,9,20,30,2};
		int res=sort(return ar);
		
		
        for (int i = 0; i < ar.length-1; i++) 
			/*{   
            System.out.println(ar[i] + " ");  
            } */
			System.out.println(return ar[]);
	}
}
		 
		 
		 
		 
		 
		 
		 /*int[] abc={12,8,13,6,4};
		int[] arr = new int[5];
		int res1=sort(abc);
		System.out.println("Result="+res1);

		
       System.out.println();  
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: "); 

		for (int i = 0; i < ar.length; i++) 
			{   
            System.out.print(ar[i] + " ");  
            }  */
















		//for(int i=0;i<ar.length-1;i++)
		
		//	System.out.println("  for Result = "+ar[i]);
		
        //int[] res1=sort(munna);

		//System.out.println("Result = "+ar[i]);
	