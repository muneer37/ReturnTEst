import java.util.Scanner;

class PalindromeNumberAug26
{
	public static void main(String[] args) 
	{
		int r,sum=0,temp;
		
     
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE  VALUE");

	 int a=sc.nextInt();
       temp=a;
	   while(a>0)
		{
			r=a%10; // r means remendier 
			sum=(sum*10)+r;
			a=a/10;

		}

    if (temp==sum)
          {
		   System.out.println("Given value is Palindrome");
          }
	
	else
		{
			System.out.println("Given value isnot  Palindrome");
		}


	}
}
