package Array;


class Search_Element_sep11 //ascending order program
	{  
    public static boolean search (int[] arr,int ele)
		{      
          
for (int i = 0; i < arr.length; i++)
			{   
              if(arr[i]==ele)
			   	{
				  return true;
			    }
             }   
         
             
        return false;  
		}
		public static void main(String[] args)
		{
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  

		int[] arr={12,13,6,4,8};
		boolean  abc=search(arr,13);
		
			{
				System.out.print("element is "+abc);  
            }  
		}
      
}  
