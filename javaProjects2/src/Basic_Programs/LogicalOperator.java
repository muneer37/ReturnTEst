package Basic_Programs;


class LogicalOperator
{


	public static void main(String[] args) 
	{
		int a=34;
		int b=35;
		System.out.println("and valve="+(a<b&&++a>b));
		System.out.println("or valve"+(a<b||a>b));
         System.out.println("! Not valve"+ (a<b!=a>b));
         System.out.println("and value is : "+(a>b&&++a<++b));
 		System.out.println("a value is : "+(a));
 		System.out.println(" b value is : "+(b));
 		System.out.println(" orvalue is : "+(a>b||++a<++b));

		System.out.println();
	}
}
