package Important_String_Inrv;

import java.util.HashMap;
import java.util.Map;

public class Count_Rep_Num {      // count the duplicate words in a given String and storing the maps
	
	
	public static void main(String[] args)
	{
		String st="I love india i Love India I love IndIA";
		String s2 =st.toLowerCase();
		String []ar = s2.split(" ");
		Map<String, Integer> mp= new HashMap<String, Integer>();
		int count=0;

		for(int i=0;i<ar.length;i++)
		{
		    count=0;
           for(int j=0;j<ar.length;j++)
           {
		    	if(ar[i].equals(ar[j]))
		    	    {
		        	 count++;                
		            }
		    }

		    mp.put(ar[i], count);
		}

		System.out.print(mp);
	}
 
}
