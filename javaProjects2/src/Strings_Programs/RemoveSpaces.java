package Strings_Programs;

import java.util.function.Function;
public class RemoveSpaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaBc abCc";
		Function<String,String> f= s2->s2.replaceAll(" ","");  // remove the space 
		String s2 = f.apply(str);
		System.out.println(s2);
		String c3=  s2.toLowerCase();
		System.out.println(c3);
		char[] c = c3.toCharArray();
		 System.out.println(c);
		int n= c3.length()-1;
		String temp = "" ;
		int count = 0;
		for(int i=0;i<=n;i++)
		{
			count =0;
			for(int j=0;j<=n;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					temp = temp+c[i];
				}
			}
		}		
		System.out.println(temp);
		System.out.println(count);
		char [] a=temp.toCharArray();
		for(int i=0;i<=a.length-1;i++)
		{
			count=0;
			for(int j=0;j<=n;j++)
			{
				if(a[i]==c[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+"--->"+count);
			count=0;
		}
	}  
}
