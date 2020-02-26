class Constructor29Aug        //constructor overloading program usin-'this'keyword
{
	 Constructor29Aug()
	{
		 this();
		System.out.println("ZERO");
	}
	Constructor29Aug(int a)
	{
		System.out.println("a1="+a);
	}
	Constructor29Aug(double b)
	{
		this(45);
		System.out.println("b1="+b);
	}
	Constructor29Aug(int a,double b)
	{
		this(6.9);
		System.out.println("a2="+a);
			System.out.println("b2="+b);
	}
	Constructor29Aug(double b,int a)
	{
		
		System.out.println("a3="+a);
			System.out.println("b3="+b);
	}


	public static void main(String[] args) 
	{
		this(45,6.9);
		Constructor29Aug con=new  Constructor29Aug();
		Constructor29Aug con1=new  Constructor29Aug(25);
		Constructor29Aug con2=new  Constructor29Aug(4.9);
		Constructor29Aug con3=new  Constructor29Aug(25,4.9);
		Constructor29Aug con4=new  Constructor29Aug(4.9,25);
	}
}
