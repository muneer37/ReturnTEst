package interview_Programs;

import java.util.Scanner;

class Strng_Polindrome 
{
 public static void main(String[] args) 
	{
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("ENTER THE VALUES ");
	  String str=sc.next();
	  char[]c=str.toCharArray();
	  int n= str.length()-1;
	  String temp="";
        for (int i=n;i>=0 ;i-- )
        {
		  temp=temp+c[i];
        }
		if (str.equals(temp))
		{
			System.out.println("value is polindrome");
		}
		else
		{
			System.out.println("value is not polindrome");
		}
	}
}

