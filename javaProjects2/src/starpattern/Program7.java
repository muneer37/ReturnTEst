package starpattern;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;  // n= no.of rows -1= 4-1=3;
		for(int r=0;r<=n;r++)
		{
		for(int c=0;c<=n;c++)
		{
			if (r+c >= n )
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	
		for(int r=0;r<=n;r++)
		{
		for(int cl=0;cl<=n;cl++)
		{
			if (r< cl )
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		}

	}

}
