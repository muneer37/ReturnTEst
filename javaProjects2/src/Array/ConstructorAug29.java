package Array;
class ConstructorAug29       //constructor overloading program and using this keyword
{
	 ConstructorAug29()
	{
		System.out.println("Constructor without args");
	}
	ConstructorAug29(int a)
	{
		System.out.println("a1="+a);
	}
	ConstructorAug29(double b)
	{
		System.out.println("b1="+b);
	}
	ConstructorAug29(int a,double b)
	{
		System.out.println("a="+a);
			System.out.println("b="+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Constr_Chaningproblem con=new  Constr_Chaningproblem();
		Constr_Chaningproblem con1=new  Constr_Chaningproblem(25);
		Constr_Chaningproblem con2=new  Constr_Chaningproblem(4.9);
		Constr_Chaningproblem con3=new  Constr_Chaningproblem(25,4.9);
		//Constructor29Aug con=new  Constructor29Aug();
	}
}
