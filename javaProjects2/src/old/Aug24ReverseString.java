class Aug24ReverseString 
{
	public static void main(String[] args) 
	{
		String str=" UBAB HSEHAM ";
		
		char [] ch= str.toCharArray();
		int n= str.length()-1;
		
		
		for (int i=n;i>0 ;i-- )
	       {
			
              System.out.print(""+ch[i]);
			n--;
		   }
	}
}
	