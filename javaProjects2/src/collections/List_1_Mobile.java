package collections;
import java.util.*;
import java.lang.Package;
                                                 // LIST -1 
public class List_1_Mobile implements Comparable {
	String brand;
	String colour;
	int imi;
	public List_1_Mobile(String brand,int imi,String colour)
	{
		super();
		this.brand=brand;
		this.colour=colour;
		this.imi=imi;
	}
	@Override
	public String toString()
	{
	 return "Munna(imi="+imi+",colour="+colour+",brand="+brand+")";
    }
	@Override
	public int hashCode()
	{
		System.out.println("calling hashcode method");
		return imi;
	}
	public boolean equals(Object ob)
	{
	List_1_Mobile mt=(List_1_Mobile)ob;
	System.out.println("calling equals");
	return ((Integer)this.imi==mt.imi);
	}
	public int compareTo(Object ob) {
		List_1_Mobile mt=(List_1_Mobile)ob;
		return this.colour.compareTo(mt.colour);
	}
	
}


