package starpattern;

public class Program8 {     // perfect number 

	public static boolean isperfect(int num)
	{
		int sum=0;
		
	for (int i=0 ; i <= num%2; i++)
		{if(num%i ==0)
			
			{
				sum=sum+i;
			}
		}
	return num == sum ;
	}
	
public static void main(String[] args)
{
            boolean res= isperfect(225);
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