package com.javapractice;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="skMUNEER37*";
		char[] c=a.toCharArray();
		System.out.println("Lenth before : "+a.length());
		char u='U'; 
		char l='L';
		char n='N';
		char s='S';
		for(int i=0;i<a.length();i++)
		{
			
			if(c[i]>=97 && c[i]<=122 || c[i]>=65 && c[i]<=90 || 
					c[i]>=48 && c[i]<=57 || c[i]>=32 && c[i]<=47)
			{
			if(c[i]>=48 && c[i]<=57)
			{
				c[i]=n;
			}
			
			else if(c[i]>=65 && c[i]<=90)
			    {
				c[i]=u;
	           }
			else if(c[i]>=97 && c[i]<=122)
			{
				c[i]=l;
				
			}
			
			else if(c[i]>=32 && c[i]<=47)
			    {
				c[i]=s;
				}
			System.out.print(c[i]);
			}
		}	
		
		System.out.println("\nLength After : "+c.length);

	}

}
