package starpattern;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;  // n= no.of rows -1= 4-1=3;
		for(int r=0;r<=n;r++)
		{
		for(int c=0;c<=n;c++)
		{
			if (r+c >= n )
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}
