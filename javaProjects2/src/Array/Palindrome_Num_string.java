package Array;
import java.util.Scanner;

class Palindrome_Num_string
{
	public static void main(String[] args) 
	{
   

	 Scanner sc=new Scanner(System.in);

	 System.out.println("ENTER THE STRING VALUE");

	 String str=sc.next();// syntax 

	 char[] c=str.toCharArray();

	 int n=str.length()-1;

	 String temp="";


   for (int i=n;i>=0 ;i--)
			
	   {
		n--;
		temp=temp+c[i];
	   }
		
		if(str.equals (temp))
		{
		System.out.println("Given String is Palindrome");
		}
		else
		{

		System.out.println("Given String is not Palindrome");
	     }
    }
}
