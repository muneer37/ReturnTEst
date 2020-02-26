interface Demo1
{

void print ()
}
class A6 implements Demo1
{
	public void print()
	{
		System.out.println("hello");
	}
}

public static void main(String [] args)
{
	A6 ref= new A6();
	ref.print();
}