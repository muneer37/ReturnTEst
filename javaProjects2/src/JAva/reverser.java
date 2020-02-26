package JAva;

import java.util.Scanner;

public class reverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING ");
		String str= sc.next();
		char[] ch = str.toCharArray();
		int n= str.length()-1;
		String temp=" ";
		for(int i=n;i>=0;i--)
			
		{
			temp= temp+ch[i];
		
		}
		System.out.println(temp);
		
		
	if(str.equals(temp))
	{
		System.out.println("given string is polindrome");
	}
	else
	{ 
		System.out.println("not polindrome ");
		
	}
	}

}
