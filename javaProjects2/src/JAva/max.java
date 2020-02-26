package JAva;

public class max {

	public static void main(String[] args) {
		
 
		
		int [] ar={12,34,55,64,66,443};
	    int mam= ar[0];
	    for (int i=1;i<ar.length;i++)
	    {

                   if(mam < ar[i])
                   {
                	   mam =ar[i];
                   }
	    
	   }
	    
	    System.out.println(mam);
	}

}
