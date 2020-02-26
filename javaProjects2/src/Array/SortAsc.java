package Array;

class SortAsc 
	{  
    public static int[] sort (int[] arr)
		{      
        for (int i = 0; i < arr.length; i++)   //Sort the array in ascending order 
			{   
            for (int j = i+1; j < arr.length; j++) 
				{   
               if(arr[i] > arr[j])
				   {  
                  int temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
                  }   
            }   
        }  
        
        return arr;  
		}
		public static void main(String[] args)
		{
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
		int[] arr={12,13,6,4,8};
		int temp = 0;
		int[] abc=sort(arr);
        for (int i = 0; i < abc.length; i++) 
			{   
            System.out.print(arr[i] + " ");  
            }  
    }  
}  