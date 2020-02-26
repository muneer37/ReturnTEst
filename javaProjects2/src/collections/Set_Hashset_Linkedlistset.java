package collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Set_Hashset_Linkedlistset {              //HashSet type-out put

	public static void main(String[] args) {
	
		//LinkedHashSet hs=new LinkedHashSet();
		HashSet hs=new HashSet();
		
		List_1_Mobile m1= new List_1_Mobile("mi",1,"rainbow");
		List_1_Mobile m2= new List_1_Mobile("mi",12,"rainbow");
		List_1_Mobile m3= new List_1_Mobile("mi",12,"rainbow");
		List_1_Mobile m4= new List_1_Mobile("apple",2,"silver");
		List_1_Mobile m5= new List_1_Mobile("oppo",5,"gold");
		List_1_Mobile m6= new List_1_Mobile("nokia",3,"pink");
		
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		hs.add(m4);
		hs.add(m5);
		hs.add(m6);
		for(Object ob:hs)
		{
			System.out.println(ob);
		}	
	
	}

}
