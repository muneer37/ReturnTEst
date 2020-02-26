package javapractice;

/*public class Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MAHA@#4raja";
		char[] ch=str.toCharArray();
		int n=str.length();
		int count =0;
		for (int i=0;i<=n;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
		     count++;
			}
		}
            System.out.print(count);

	}

}*/
public class Program30 {    // without inbuilt functions 

public static void main(String[] args){
String str = "apple";
StringBuilder sb = new StringBuilder(str);
str = sb.reverse().toString();
System.out.println("ReverseString : "+str);
}

}
