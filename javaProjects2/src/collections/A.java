package collections;

public interface A {
      void display();
}
abstract class B 
{

	public void display() 
	{
	System.out.println("hii");	
		
	}
}
class C extends B implements A
{
	public static void main( String [] args){
		System.out.println("byee ");
	}
}