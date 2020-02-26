package collections;



public class Comparable_interface implements Comparable  // main method name -Tree_set
{
	String name;
	double  rating;
	double duration;
	public Comparable_interface(String name,   double rating,    double duration)
	{
		this.name=name;
		this.rating=rating;
		this.duration=duration;
		
	}
	@Override
	public String toString()
	{
		return "Movie(name="+name      +",    duration="+duration+"  ,rating="+rating+")";
	}
	/*@Override
	public int compareTO(Object ob) {             //RATING accending order 
		
		Comparable_interface mt=(Comparable_interface)ob;
		//System.out.println(this.rating+"-"+mt.rating);
		return (int)(this.duration-mt.duration); 
	}*/
	public int compareTo(Object ob) {             // Duration accending order 
		
		Comparable_interface mt=(Comparable_interface)ob;
		return (int)((this.duration-mt.duration)*1000);
		
		
	
	}
}

  