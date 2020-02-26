package collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.lang.Iterable;


public class List_LinkedList {               // Linked List type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ts=new LinkedList();     // LinkedList type
		List_1_Mobile m1= new List_1_Mobile("mi",12345,"rainbow");
		List_1_Mobile m2= new List_1_Mobile("mi",1245,"rainbow");
		List_1_Mobile m3= new List_1_Mobile("mi",1245,"rainbow");
		List_1_Mobile m4= new List_1_Mobile("apple",37,"silver");
		List_1_Mobile m5= new List_1_Mobile("oppo",25,"gold");
		List_1_Mobile m6= new List_1_Mobile("nokia",1212465,"pink");
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m5);
		ts.add(m6);
		
		for(Object ob:ts)
		{
			System.out.println(ob);
		}
	
		
	
	}

}


