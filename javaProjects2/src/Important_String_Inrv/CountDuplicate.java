package Important_String_Inrv;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicate {   // count duplicate in words
	
	public static void duplicatechar(String inputdata)
	{
		String str = inputdata.toLowerCase();
		char [] ch = str.toCharArray();
		HashMap<Character,Integer> maps = new HashMap<Character,Integer>();
		for(char cdata :ch){
			if(maps.containsKey(cdata))
			{
				int n = maps.get(cdata)+1;
				maps.put(cdata,n);
			}
			
                  else{
				maps.put(cdata, 1);
			}
	 }
		Set<Character> setchar = maps.keySet();
		for(Character crt : setchar)
		{
			if(maps.get(crt) > 1)
			{
				System.out.println(crt+" = "+maps.get(crt) );
			}
		}
  }

	public static void main(String[] args) {
      
		duplicatechar("Java  java");
		duplicatechar("munna Munna");

	  }

}
