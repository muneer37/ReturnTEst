package collections;
import java.util.*;
import java.lang.*;


public  class Tree_SortBaseName implements Comparator {   //part-4
	
		
				public int compare(Object ob1,Object ob2)
				{Comparable_interface ref=(Comparable_interface)ob1;
			Comparable_interface ref2=(Comparable_interface)ob2;
				String s1="this.name";
				String s2="ref.name";
				return s1.compareTo(s2);
				}

					
	}


