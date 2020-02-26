package NumberPatterns;

public class Num_pat6 {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		for (int i=1;i<=n;i++)
		{
			for (int space=n;space > i;space-- )
			{
			  System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k);
			}
			for(int r=1;r<i;r++)
			{
				if(r<i)
				{
				System.out.print(count++);
				}
				else
				{
				System.out.print(count++-1);
				}
			}
			System.out.println();
		}

	}

}
