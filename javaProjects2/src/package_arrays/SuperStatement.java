package package_arrays;


class Super
{
	Super(int a)
	{
		//super();
	    System.out.println("a="+a);
	}
}
class Sample2 extends Super
{
	Sample2 (double b)
	 {
		super(20);
	    System.out.println("b="+b);
	 }
	
}

public class SuperStatement 
  {
	public static void main(String[] args) 

	  {
	
      Sample2 ref = new Sample2(23.4);
      }

}

