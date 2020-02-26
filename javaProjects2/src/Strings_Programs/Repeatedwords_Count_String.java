package Strings_Programs;

import java.util.HashMap;
import java.util.Set;

public class Repeatedwords_Count_String {   //type-2
	
	
	public static void main(String[] args) {
		

	     // /* 
	        String S1 = "This is testing Program Testing Program testing";
	        
	 String S2 = S1.toLowerCase();
	        String[] S3 = S2.split(" ");

	        HashMap<String, Integer> map = new HashMap<>();

	        for (String t : S3) {
	        	
	        	
	            if (map.containsKey(t)) {
	            	
	            	int key =map.get(t) + 1;
	                map.put(t, key);
	              //  System.out.println(  map.get(t));

	            } else {
	                map.put(t, 1);
	            }
	        }
	        Set<String> keys = map.keySet();
	        
	        for (String key : keys) {
	            System.out.print(key);
	            System.out.println(" - word is repeated ="+map.get(key));
	        }


		}


}
