package Basic_Programs;
class Test3 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=0;

		for(int z=0;z<5;z++)
		{
			if((++a>=2)||(++b>=2))
			{
				++a;
			}
		}

		System.out.println(a+"  "+b);
	}
}
