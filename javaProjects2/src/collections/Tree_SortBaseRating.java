package collections;
import java.util.*;
import java.lang.*;

public class Tree_SortBaseRating implements Comparator{  
	
	public int compare(Object o1,Object o2)
	{

		Comparable_interface mt1=(Comparable_interface)o1;
		Comparable_interface mt2=(Comparable_interface)o2;
		
		
		return (int)(mt1.rating-mt2.rating);
	}
	

}
