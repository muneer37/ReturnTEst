package Important_String_Inrv;

public class R_Reverse {

	public static void main(String[] args) {
		
		String s1 = "we are Love India";
		
		String [] str= s1.split(" ");
		
		String s="";
		
		for( int i =str.length-1;i>=0;i--)
		{
			s=s+ str[i]+" ";
		}
		System.out.println(s);

	}

}
