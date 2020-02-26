package starpattern;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;  // n= no.of rows 
		for(int r=0;r<=n;r++)
		{
		for(int c=0;c<=n;c++)
		{
			if (r<=c )
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
