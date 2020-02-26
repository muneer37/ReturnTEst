package old;
class Arrays_Reverse_aug24 
{
	public static void main(String[] args) 
	{
		int str={12,14,19,25};

		
		//char [] ch= str.toCharArray();

		int n= str.length()-1;
		
		
		for (int i=n;i>0 ;i-- )
	       {
			
              System.out.print(""+str[i]);
			n--;
		   }
	}
}
	