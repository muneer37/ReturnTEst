package collections;
import java.util.*;

public class Vect_Program {     // using ITERATOR()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar= new ArrayList();
		int size=ar.size();
		System.out.println("intial level size="+size);
		List_4_Capgemini c1= new List_4_Capgemini(1,2,3);
		List_4_Capgemini c2= new List_4_Capgemini(4,5,6);
		List_2_Holiday h1=new List_2_Holiday("diwali",1);
		List_2_Holiday h2=new List_2_Holiday("ramazan",0);
		LIist_3_Munna m1= new LIist_3_Munna("surya",5.0,1000);
		
		ar.add(h1);
		ar.add(h2);
		ar.add(m1);
		ar.add("no holiday");
		ar.add("no holiday");
		ar.add(null);
		ar.add(m1);
		ar.add(c2);
		ar.add(h1);
		
		System.out.println("size="+ar.size());
		Iterator ref=ar.iterator();
		while(ref.hasNext())
	
		{
			Object ob=ref.next();
		
			System.out.println(ob);
		}
	}
}
