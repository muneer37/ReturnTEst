package Array;
class Array23 
	{   
	public static int[] sort (int[] arr)
		{      
                                                                     //Initialize array   
        int [] arr1 = new int [] {5, 2, 8, 7, 1};   
        int temp = 0; 
                                                            //Sort the array in ascending order  
        for (int i = 0; i < arr1.length; i++)
		{   
            for (int j = i+1; j < arr1.length; j++) 
			{   
                   if(arr1[i] > arr1[j])  
				{  
                   temp = arr1[i];  
                   arr1[i] = arr1[j];  
                   arr1[j] = temp;  
               }   
            }   
        }  
        
        System.out.println();  
          
                                                                                //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
        for (int i = 0; i < arr1.length; i++) 
			{   
            System.out.print(arr1[i] + " ");  
            }
		return arr1;  
    }  
  

   public static void main(String[] args)
	{
	    
		 
         System.out.println("Elements of original array: ");   //Displaying elements of original array 
    
	}
}