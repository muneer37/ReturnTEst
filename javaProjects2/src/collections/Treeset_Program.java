  package collections;
import java.util.TreeSet;
                                                     // TRESS SET

	public class Treeset_Program {

		public static void main(String[] args) {
			
			Comparable_interface m1= new Comparable_interface("madhav", 1,20);
			Comparable_interface m2= new Comparable_interface("raja",   7,10);
			Comparable_interface m3= new Comparable_interface("kavi"  , 3,50);
			Comparable_interface m4= new Comparable_interface("vini",   5,40);
			Comparable_interface m5= new Comparable_interface("munna" , 5,50);
			Comparable_interface m6= new Comparable_interface("fathi",  5,60);
			Comparable_interface m7= new Comparable_interface("neelu",  6,60);
			Comparable_interface m8= new Comparable_interface("meera",  2,70);
			
		  TreeSet ts= new TreeSet();
		  ts.add(m1);
		  ts.add(m2);
		  ts.add(m3);
		  ts.add(m4);
		  ts.add(m5); 
		  ts.add(m6);
		  ts.add(m7);
		  ts.add(m8);
		  System.out.println("intial values");
		  
		  for (Object ob:ts)
		  {
			  System.out.println(ob);
		  }
		  TreeSet ts1= new TreeSet(new Tree_SortBaseRating());
		  ts1.add(m1);
		  ts1.add(m2);
		  ts1.add(m3);
		  ts1.add(m4);
		  ts1.add(m5); 
		  ts1.add(m6);
		  ts1.add(m7);
		  ts1.add(m8);
		  System.out.println(" first values");
		  
		  for (Object ob:ts1)
		  {
			  System.out.println(ob);
		  }
		  TreeSet ts2= new TreeSet(new Tree_SortBaseName ());
		  ts2.add(m1);
		  ts2.add(m2);
		  ts2.add(m3);
		  ts2.add(m4);
		  ts2.add(m5); 
		  ts2.add(m6);
		  ts2.add(m7);
		  ts2.add(m8);
		  System.out.println(" values");
		  
		  for (Object ob:ts2)
		  {
			  System.out.println(ob);
		  }
		 
		
	
		}
		
}
