package Basic_Programs;
class Logical
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		int a=23;
		int b=45;
		
		
		System.out.println("and value is : "+(a>b&&++a<++b));
		System.out.println("a value is : "+(a));
		System.out.println(" b value is : "+(b));
		System.out.println(" orvalue is : "+(a>b||++a<++b));
	
        System.out.println("main method ended");
	}
}