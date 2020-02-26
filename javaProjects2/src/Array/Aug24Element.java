package Array;
class Aug24Element 
{
	public static boolean search(int [] ar,int ele)

	{
		for (int i=0;i<ar.length ;i++ )

		{
			if(ar[i]==ele)
			{
				return true;
			}
		}
	return false;
	}

	
	public static void main(String[] args) 
	{
		int[]ar={10,15,7,40,10};
		boolean abc=search(ar,10);
		System.out.println("elements"+abc);
	}
}
