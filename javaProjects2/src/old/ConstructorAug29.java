class ConstructorAug29       //constructor overloading program and using this keyword
{
	 Constructor29Aug()
	{
		System.out.println("Constructor without args");
	}
	Constructor29Aug(int a)
	{
		System.out.println("a1="+a);
	}
	Constructor29Aug(double b)
	{
		System.out.println("b1="+b);
	}
	Constructor29Aug(int a,double b)
	{
		System.out.println("a="+a);
			System.out.println("b="+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Constructor29Aug con=new  Constructor29Aug();
		Constructor29Aug con1=new  Constructor29Aug(25);
		Constructor29Aug con2=new  Constructor29Aug(4.9);
		Constructor29Aug con3=new  Constructor29Aug(25,4.9);
		//Constructor29Aug con=new  Constructor29Aug();
	}
}
