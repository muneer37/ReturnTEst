class PolindromeReverseString28aug
{
	public static  string reverse string (String str) 
	{
		char[] ch=str.toCharArray;
		int i=0;
		int j=ch.length-1;

		while(j>i)
		{
			if (ch[i]<ch[j])
			{
				return ("is not polindrome");
			}
			i++;
			j--;
		}
		return ("is polindrome");
	}
	public static void main (String [] args)
	{
		String str="RADAR";
		String a= reverse(str);
		System.out.println(a);
	}
}
