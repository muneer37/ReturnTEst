
class SortAug24
	{  
    public static char[] sort (char[] arr)
		{   
		char[] ch=arr.toCharAray;
        for (int i = 0; i < arr.length; i++)   //Sort the array in ascending order 
			{   
            for (int j = i+1; j < arr.length; j++) 
				{   
               if(arr[i] > arr[j])
				   {  
                  char temp = arr[i];  
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
		String arr="java";
		//int temp = 0;

		char[] abc=sort(arr);
        
        }  
}  