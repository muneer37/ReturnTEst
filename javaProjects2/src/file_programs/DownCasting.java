package file_programs;
class Munna 
{
	int c=89;
	public String a;
	public String d;
	
	public void test()
	{
		System.out.println("hii ");
	}


	
	
}
	class Raja extends Munna
	{
		int b=90;
		public String a;
     public void java()
	  {
		System.out.println(" how r u");
	  }
}
class Basha extends Raja
	{
		int d=91;
     public void apti()
	{
		System.out.println(" dil r u");
	}
	
}
	
class Downcasting
{
public static void main(String[] args) 
	{
	Munna ref = new Basha();
	System.out.print(""+ref.c);
	ref.test();
	
       Raja ref2 = (Raja)ref;
		System.out.println("a1="+ref2.a);
		ref2.test();
		ref2.java();
		System.out.println("a2="+ref2.a);
		System.out.println("b2="+ref2.d);
		Basha ref3= (Basha)ref2;
          ref3.apti();
          ref3.test();
          ref3.java();
              
		System.out.println("a3="+ref3.a);
		System.out.println("b3="+ref3.d);
		System.out.println("c="+ref3.c);
	}
}
