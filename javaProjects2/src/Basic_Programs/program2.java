package Basic_Programs;
class program2

{
	static double b=7.8;
	public static void display()
	{
	System.out.println("executing display method");
	}
	 static char ch='a';
}
	class MainClass2
	{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		System.out.println("b=" +program2.b);
		program2.display();
        System.out.println("ch=" +program2.ch);
		System.out.println("main method ended");

	}
}
