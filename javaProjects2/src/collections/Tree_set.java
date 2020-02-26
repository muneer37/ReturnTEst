package collections;
import java.util.TreeSet;


public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable_interface m1= new Comparable_interface("a",4.5,5.0);
		Comparable_interface m2= new Comparable_interface("a",3.1,3.0);
		Comparable_interface m3= new Comparable_interface("b",4.2,99.0);
		Comparable_interface m4= new Comparable_interface("c",8.8,5.0);
		Comparable_interface m5= new Comparable_interface("d",8.8,2);
		Comparable_interface m6= new Comparable_interface("f",7.7,3);
		Comparable_interface m7= new Comparable_interface("e",10.0,31);
		Comparable_interface m8= new Comparable_interface("b",4.5,5);
		
	  TreeSet ts= new TreeSet();
	  ts.add(m1);
	  ts.add(m2);
	  ts.add(m3);
	  ts.add(m4);
	  ts.add(m5); 
	  ts.add(m6);
	  ts.add(m7);
	  ts.add(m8);
	  System.out.println("sort based on Duration");
	  for (Object ob:ts)
	  {
		  System.out.println(ob);
	  }
	  TreeSet ts2= new TreeSet(new Tree_SortBaseName());
	  ts2.add(m1);
	  ts2.add(m2);
	  ts2.add(m3);
	  ts2.add(m4);
	  ts2.add(m5); 
	  ts2.add(m6);
	  ts2.add(m7);
	  ts2.add(m8);
	  System.out.println("based on Name");
	  for (Object ob:ts2)
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
	  System.out.println(" Based on Rating");
	  for (Object ob:ts1)
	  {
		  System.out.println(ob);
	  }
	  
	}

}
