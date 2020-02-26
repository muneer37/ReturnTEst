package starpattern;

public class Program4 {      // 2 & 3 rd adding program

	public static void main(String[] args) {
	  
		int n=4;  // n= no.of rows 
		for(int r=0;r<=n;r++)
		{
		for(int c=0;c<=n;c++)
		{
			if (r+c>4 )
			{
				System.out.print("* ");
			}
		}
		System.out.println();
		}
	

	for(int r=1;r<=n;r++)
	{
	for(int cl=1;cl<=n;cl++)
	{
		if (r+cl <= n )
		{
			System.out.print("* ");
		}
	}
	System.out.println();
	}
}
	
}
