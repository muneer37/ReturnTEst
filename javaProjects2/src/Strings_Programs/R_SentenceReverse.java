package Strings_Programs;

public class R_SentenceReverse {

	public static void main(String[] args) {
		
		String rr=" we are bad";  // output =   ew era dab
		
	    char[] ch=rr.toCharArray();
	
		for(int i=0;i<=ch.length/2;i++)
			
		{
			
			char c1 = ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=c1;
		}
		String s2= new String(ch);
		System.out.println(s2);
	}

}
