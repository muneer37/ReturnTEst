package maps;
import java.util.*;

import java.util.HashMap;

public class P1_HashMap {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("key1", "value1");
		hm.put("key2", "value2");
		hm.put("key3", "value3");
		hm.put("key3", "value4");
		
		Object ob = hm.get("key1");
		System.out.println(ob);
		
		Object ob2 = hm.get("key2");
		System.out.println(ob2);
		Object ob3 = hm.get("key3");
		System.out.println(ob3);
		Object ob4 = hm.get("key3");
		System.out.println(ob4);

	}

}
