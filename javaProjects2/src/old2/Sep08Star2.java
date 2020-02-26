class Sep08Star2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=4;j>=1 ;j-- )
			{
				if(j>i)
				{
			       System.out.print(" ");
				}
			   else
				{
		           System.out.print(" *");// star before one space 
				}
				  
			}
			System.out.println();
		}
	}
}
