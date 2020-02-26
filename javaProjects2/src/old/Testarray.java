

class Testarray       //biggest element in array
 
{
	public static void main(String[] args)       
	{
		int []ar={12,48,3,54,18}; // dec,instations,inlizations
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
    System.out.println("max="+max);
	}
}
