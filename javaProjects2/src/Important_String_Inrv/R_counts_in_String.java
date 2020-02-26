package Important_String_Inrv;

public class R_counts_in_String {

	public static void main(String[] args) {
	

		String mk=" shaik Muneer is  loverLess Boy @ 1234";
		
		char ch[] = mk.toCharArray();
		
		int n= ch.length-1;
		
		int up=0, lc=0,nm=0,spce=0,special=0;
		
		for(int i=0;i<n;i++)
		{
			if(ch[i]>='a'&& ch[i]<='z')
			{
				lc++;
				
			}
			
			else if(ch[i]>='A' &&ch[i]<='Z')
			{
				up++;
				
			}
			else if(ch[i]>='0'&& ch[i]<='9')
			{
				nm++;
				
			}
			else if(ch[i]==' ' )
			{
				spce++;
				
			}
			else
			{
				special++;
				
			}
		}
		System.out.println(" upper  ="+up);
		System.out.println("lower ="+lc);
		System.out.println("special ="+special);
	     System.out.println(" spaces  ="+spce);
		System.out.println("  number ="+nm);
		
	}

}
