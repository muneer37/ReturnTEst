package starpattern;

public class Program9 {

	public static boolean isPerfect(int num)
	{
		int sum=0;
		
	for (int i=0 ; i <= num%2; i++)
		{
			if(num%i == 0)
			{ 
				sum=sum+i;
			}
		}
	return num == sum ;
	}
	
public static void main(String[] args)
{
            boolean res= isPerfect(16);
            System.out.println(res);
            if(res)
            {
            	System.out.println("perfect number");
            }
            else
            {
            	System.out.print("not perfect number");
            }

}
}