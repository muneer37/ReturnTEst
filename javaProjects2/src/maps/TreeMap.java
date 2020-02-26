package maps;

import java.util.Set;

                                                 
 class Movie1 {
	String brand;
	String colour;
	int imi;
	public Movie1(String brand,int imi,String colour)
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

	
}


public class TreeMap {

	public static void main(String[] args) {

		TreeMap ref = new TreeMap();
		ref.put("java",new Movie1("mi",7890,"Gold"));
		ref.put("test",new Movie1(null, 0, null));
		ref.put(4,"ra");
		ref.put(5,"Rahul");
		
		  Set set=ref.entrySet();
		
		for (Object ob1:ref)
		{
                 Object ob3 = ref.get(ob1);
			System.out.println(ob1);
			System.out.println("value="+ob1);
			System.out.println("keys="+ob3);

		}
	}

}






