package collections;
import java.util.*;


                                                    // LINKED LIST -4 -out put
public class List_Arraylist {
public static void main(String[] args)
{
		//ArrayList ar = new ArrayList();
		LinkedList ar=new LinkedList();
		int size=ar.size();
		System.out.println("intial level size="+size);
		List_4_Capgemini c1= new List_4_Capgemini(1,2,3);
		List_4_Capgemini c2= new List_4_Capgemini(4,5,6);
		List_2_Holiday h1=new List_2_Holiday("diwali",1);
		List_2_Holiday h2=new List_2_Holiday("ramazan",0);
		LIist_3_Munna m1= new LIist_3_Munna("surya",5.0,1000);
		
		ar.add("H1="+h1);
		ar.add("h2="+h2);
		ar.add("m1="+m1);
		ar.add("no holiday");
	    ar.add("no holiday");
		ar.add(null);
		ar.add("m1="+m1);
		ar.add("c2="+c2);
		ar.add("h1="+h1);
		ar.add(null);
		
		System.out.println("size="+ar.size());
		for(Object ob:ar)
		{
			System.out.println(ob);
		}
	
		
		
		// method -2
		
		/*for (int i=0;i<ar.size();i++)    
		{
			Object ob= ar.get(i);
			if(ob instanceof List_4_Capgemini)
			{
				List_4_Capgemini ct= (List_4_Capgemini)ob;
				System.out.println(ct.attendance);
				System.out.println(ct.noofRounds);
				System.out.println(ct.rating);
			}
			else if(ob instanceof List_2_Holiday)
			{
				List_2_Holiday h= (List_2_Holiday)ob;
				System.out.println(h.days);
				System.out.println(h.festival);
				System.out.println(h.festival);
			}
			else if(ob instanceof LIist_3_Munna)
			{
				LIist_3_Munna m= (LIist_3_Munna)ob;
				System.out.println(m.name);
				System.out.println(m.duration);
				System.out.println(m.rating);
			}
			else
			{
				System.out.println(ob);
			}*/
		
		

	}

}
