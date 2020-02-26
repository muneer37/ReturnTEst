package Basic_Programs;
public class T2
{

public static void main(String [] args)
{
	System.out.println("T Class");
	for(int i=0;i<=5;i++)
	{
		System.out.println("\n \t");
		for(int j=0; j<i;j++)
		{
			System.out.print(" * ");
		}
	}
		System.out.println("\n\n---------------------------------------------");
		for(int i=5;i>=0;i--)
		{
			System.out.println("\n \t");
			for(int j=0; j<i;j++)
			{
			System.out.print(" * ");
			}
		}
}
}